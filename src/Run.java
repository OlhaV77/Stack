class Run {
    public static void main(String[] args) {
        Stack[] stacks = new Stack[10]; // Fix this
        stacks[0] = new Stack();
        try {
            stacks[0].push(2);
            stacks[0].push(34);
            stacks[0].push(35);
            stacks[0].push(1);
            stacks[0].push(8);
            stacks[0].push(7);
        } catch (InnerPush.PushException e) {
            System.out.println(e.getMessage());
        }

        try {
            stacks[0].pop();
            stacks[0].pop();
            stacks[0].pop();
            stacks[0].pop();
            stacks[0].pop();
            stacks[0].pop();
            stacks[0].pop();
        } catch (InnerPop.PopException e) {
            System.out.println(e.getMessage());
        }

        try {
            stacks[0].push(90);
            stacks[0].push(11);
        } catch (InnerPush.PushException e) {
            System.out.println(e.getMessage());
        }

/*
        stacks[1] = new Stack();
        try {
            int[] storage = {0, 9, 8, 7, 78, 45, 34};
            for (int i = 0; i < storage.length; i++) {
                stacks[1].push(storage[i]);
            }
        }
        catch (PushException e) {
            System.out.println(e.getMessage());
        }
        try {
            int count = 0;
            count++;
            if (count >= 5) {
                stacks[1].pop();
            }
        }
        catch (PopException e){
            System.out.println(e.getMessage());
        }


 */

    }


}
