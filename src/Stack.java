
class Run {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(5);
        stack.push(10);
        stack.push(-1);
        stack.push(-1);

        Stack stack2 = new Stack();
        stack2.push(1);
        stack2.push(1);
        stack2.push(1);
        stack2.push(1);
        stack2.push(1);

        Stack[] stacks = new Stack[10]; // Fix this
        stacks[0].push(1);

        // TODO: encapsulate Stack class
    }
}

class Stack {
    int[] storage = new int[5];
    int position = 0;

    public void push(int num) {
        if (position == 5) {
            System.out.println("Can't  add anymore");
        } else {
            storage[position] = num;
            position++;
        }
    }

    public int pop() {
        if (position < 1) {
            System.out.println("There is nothing on the stack");
        } else {
            position--;
        }

        return storage[position];
    }
}

