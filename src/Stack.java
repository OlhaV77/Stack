// Exceptions: checked vs unchecked


public class Stack {
    private int[] storage = new int[5];
    private int position;

    public void push(int number) {
        if (position == 5) {
            System.out.println("Can't  add anymore");
        } else {
            storage[position] = number;
            position++;
        }
    }

    // TODO: modify to throw an exception when empty stack
    public int pop() {
        if (position < 1) {
            System.out.println("There is nothing on the stack");
        } else {
            position--;
        }

        return storage[position];
    }
}

