// Exceptions: checked vs unchecked

// MUST BE IN WRITTEN FORM
// Formulate the question:
// What have I tried?
// What is the result of each attempt


public class Stack {
    private int position;
    private Object[] storage;
    private int size;

    Stack(int size) {
        this.size = size;
        this.storage = new Object [size];
    }

    public void increase() {


    }

    public void push(int number) throws PushException {
        if (position == 5) {
            throw new PushException("Can't  add anymore");
        } else {
            storage[position] = number;
            position++;

        }
    }

    public int pop() throws PopException {
        if (position < 1) {
            throw new PopException("There is nothing on the stack");
        } else {
            position--;
        }
        return (int) storage[position];
    }
}

