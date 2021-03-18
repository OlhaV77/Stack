class Run {
    public static void main(String[] args) throws PushException, PopException {

        // Given: random numbers, print them all in reverse order
        // example: 1,2,3,4,5,6,7,8,10
        // example output: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stack stacks = new Stack(10);


        for (int i = 0; i < input.length; i++) {
            stacks.push(input[i]);

        }
        for(int j = 0; j < input.length;j++) {
           // stacks.pop();
            System.out.println(stacks.pop());
        }
    }

}
