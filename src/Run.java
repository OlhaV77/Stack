class Run {
    public static void main(String[] args) {
        Stack[] stacks = new Stack[10]; // Fix this
        stacks[0] = new Stack();

        stacks[0].push(2);
        stacks[0].push(34);
        stacks[0].push(35);
        stacks[0].push(1);
        stacks[0].push(8);
        stacks[0].push(7);

        stacks[0].pop();
        stacks[0].pop();
        stacks[0].pop();
        stacks[0].pop();
        stacks[0].pop();
        stacks[0].pop();
        stacks[0].pop();

        stacks[0].push(90);
        stacks[0].push(11);

        stacks[1] = new Stack();
        int[] storage = {0, 9, 8, 7, 78, 45, 34};
        int count = 0;
        for (int i = 0; i < storage.length; i++) {
            count ++;
            stacks[1].push(storage[i]);

            if(count >=5){
               stacks[1].pop();
            }
        }
    }
}
