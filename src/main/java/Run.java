class Run {
    public static void main(String[] args) {
        Stack[] stacks = new Stack[10];        // Fix this
        stacks[0] = new Stack();
        stacks[0].increase();
        try {
            stacks[0].push(2);
            stacks[0].push(34);
            stacks[0].push(35);
            stacks[0].push(1);
            stacks[0].push(8);
            stacks[0].push(7);
        } catch (PushException e) {
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
        } catch (PopException e) {
            System.out.println(e.getMessage());
        }

        try {
            stacks[0].push(90);
            stacks[0].push(11);
        } catch (PushException e) {
            System.out.println(e.getMessage());
        }
    }
}
