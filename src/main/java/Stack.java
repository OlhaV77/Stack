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
        int[] newStorage = new int[storage.length + 5];             // new storage

        for (int i = 0; i < storage.length; i++) {            // copied all data
            newStorage[i] = storage[i];
        }

        storage = newStorage;   // swap old storage for new storage
    }

    void decrease() {
        int[]newStorage = new int[storage.length - 5];            // newStorage = 1,2,3,4,5
        for(int i = 0; i < storage.length - 5 ; i++){
            newStorage[i] = storage[i];
        }
        storage = newStorage;
        position = storage.length;

    }

    public void push(int number) throws PushException {
        if (position == storage.length) {                        //position  = storage length
            throw new PushException("Can't  add anymore");
        } else {
            storage[position] = number;
            position++;
        }
    }




    public int pop() throws PopException {
        if (position < 1) {                                                 //position < 1 (равна 0)
            throw new PopException("There is nothing on the stack");
        }
      else {
            position--;
        }
      return storage[position];
    }

}

