class Run {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        Stack[] stacks = new Stack[10]; // Fix this
        stacks[0] = new Stack();
        stacks[0].setNumber(6);
        stacks[0].push();
        stacks[0].setNumber(78);
        stacks[0].push();
        stacks[0].setNumber(45);
        stacks[0].push();
        stacks[0].setNumber(3);
        stacks[0].push();
        stacks[0].setNumber(12);
        stacks[0].push();
        stacks[0].setNumber(67);
        stacks[0].push();

        stacks[0].pop();
        stacks[0].pop();
        stacks[0].pop();
        stacks[0].pop();
        stacks[0].pop();
        stacks[0].pop();

        stacks[0].setNumber(10);
        stacks[0].push();
        stacks[0].setNumber(11);
        stacks[0].push();


        stacks[1] = new Stack();
        int[] storage = {0, 9, 8, 7, 78, 45, 34};
        int count = 0;
        for (int i = 0; i < storage.length; i++) {
            count ++;
            stacks[1].setNumber(storage[i]);
            stacks[1].push();
            if(count >=5){
               stacks[1].pop();
            }
        }
    }
}


// TODO: encapsulate Stack class


public class Stack {

    private int[] storage = new int[5];
    int position;
    private int number;


    public void setNumber(int number) {                   //  encapsulation number
        this.number = number;
    }

    public void push() {
        if (position == 5) {
            System.out.println("Can't  add anymore");
        } else {
            storage[position] = number;
            position++;
        }
    }

    public int pop() {
        if (position < 1) {
            System.out.println("There is nothing on the stack");
        } else {
            position--;
        }
        return number;
    }
}

