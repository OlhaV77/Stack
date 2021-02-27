
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
        System.out.println(stack.pop());    // Display: nothing on the stack...


        // stack.push(1);
        // stack.push(5);
        // stack.push(10);
        // stack.push(-1);
        // stack.push(5);
        //  stack.push(5);      // Display: can't add...
    }
}

class Stack {
    int[] storage = new int[5];
    int count = 0;


    public void push(int num) {
        System.out.println("push -> " + num);
        storage[count] = num;                      //storege[0] = 1;
        count++;
        for (int i = 0; i < count; i++) {     // storege[1] = 5
            System.out.print("  " + storage[i]);
        }
        System.out.println();
        System.out.println();
    }


    int index = 0;
    public int pop() {

            for (int j = 0; j < count - index; j++) {
                System.out.print( storage[ j] + "  ");
            }
        index++;
        System.out.println();
        System.out.print("pop  ");
        return storage[count-index];
    }

}

