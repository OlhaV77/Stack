// Exceptions: checked vs unchecked

// MUST BE IN WRITTEN FORM
// Formulate the question:
// What have I tried?
// What is the result of each attempt


public class Stack {
    private int position;
    private int[] storage;

    Stack(int size) {                                  //overload method , which indicates the size
        this.storage = new int[size];
    }

    Stack() {                                       // overload method , which indicate the another size
        this.storage = new int[5];
    }

    void increase() {
        storage = new int[storage.length + 5];
    }

    void decrease() {
        storage = new int[storage.length];
    }


    public void push(int number) throws PushException {
        if (position == storage.length) {                              //position element = storage length
            throw new PushException("Can't  add anymore");
        } else {

              for (int i = 0; i < storage.length; i++) {
                  position = i;
                  storage[position] = number;

                    }
        }
    }

    public int pop() throws PopException {
        if (position < 1) {                                                 //position < 1 (равна 0)
            throw new PopException("There is nothing on the stack");
        } else {
            position--;
        }
        return storage[position];
    }

}

