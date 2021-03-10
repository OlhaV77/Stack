// Exceptions: checked vs unchecked

import java.io.*;

// MUST BE IN WRITTEN FORM
// Formulate the question:
// What have I tried?
// What is the result of each attempt


public class Stack {
    private int position;
    private int[] storage = new  int[5];


    public void push(int number) throws InnerPush.PushException {
        if (position == 5) {
            throw new InnerPush.PushException("Can't  add anymore");
        } else {
            storage[position] = number;
            position++;
        }
    }

    public int pop() throws InnerPop.PopException {
        if (position < 1) {
            throw new InnerPop.PopException("There is nothing on the stack");
        } else {
            position--;
        }
        return storage[position];
    }
}

