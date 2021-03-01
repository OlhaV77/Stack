
class Run {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(5);
        stack.push(10);
        stack.push(-1);


        System.out.println(stack.pop());    // -1
        System.out.println(stack.pop());    // 10
        System.out.println(stack.pop());    // 5
        System.out.println(stack.pop());    // 1
        //  System.out.println(stack.pop());    // Display: nothing on the stack...


        stack.push(11);
        stack.push(55);
        stack.push(100);
        stack.push(-11);
        stack.push(55);
        stack.push(5);
        System.out.println(stack.pop());    // -11
        System.out.println(stack.pop());    // 100
        System.out.println(stack.pop());    // 55
        System.out.println(stack.pop());    // 11

        // Display: can't add...

    }
}

class Stack {
    int[] storage = new int[5];
    int count = 0;

    public void push(int num) {
        storage[count] = num;

        if (count == 0) {
            System.out.println("There is nothing on the stack");
        }
        count++;                   //1, 2, 3,4

        for (int i = 0; i < count; i++) {
            System.out.print(storage[i] + " ");
        }
        System.out.println();
    }

    public int pop() {
        count--;                 //3,2,1
        for (int i = 0; i < count; i++) {
            System.out.print(storage[i] + " ");
            if (count > 5) {
                System.out.println("Can't add anymore.");
            }
        }
        // return storage[count]
        // count--;
        return storage[count];
    }


}
