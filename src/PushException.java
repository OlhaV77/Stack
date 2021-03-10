public  class PushException extends Exception {
        PushException(String message) {
            super(message);
        }
    }

    /*
    int increase(int num){
        Stack[] stack = new Stack[10];
        stack[0] = new Stack();
        stack[0] = new Stack();
        int longs = 5;
        try {

            int[] storage = new int[longs];
            for (int i = 0; i < storage.length; i++) {
                storage[0] = num;
                stack[0].push(storage[i]);
                num++;
                longs++;
            }

        } catch (PushException.PushException e) {
            System.out.println(e.getMessage());
        }
        return num;
    }

    */

