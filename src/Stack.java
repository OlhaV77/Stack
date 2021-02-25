

class Run {
    public static void main(String[] args) {

        Stacks stack = new StackPush();
        int[] push = new int[]{56, 34, 1, 45, 7};

        stack.stack_push(push);
        stack.stack_pop(push);


    }
}

interface Stacks {
    void stack_push(int[] push);

    void stack_pop(int[] push);
}

class StackPush implements Stacks {

    public void stack_push(int[] push) {

        int index = 0;
        for (int j = 0; j < push.length; j++) {
            index++;

            if (push.length <= 5) {
                System.out.println("push -> " + push[j]);
            }

            if (push.length >= 6) {
                System.out.println("Can't add anymore");
            }
            System.out.print("stack -> ");
            for (int i = 0; i < index; i++) {
                System.out.print(push[i] + "  ");
            }
            System.out.println();
        }

    }

    public void stack_pop(int[] push) {
        int index = 0;
        System.out.println();
        for (int i = push.length - 1; i >= 0; i--) {
            index++;
            System.out.println("pop -> " + push[i]);

            if (push.length == 0) {
                System.out.println("There is nothing on the stack");
            }
            System.out.print("stack -> ");
            for (int j = 0; j < push.length - index; j++) {
                System.out.print(push[j] + " ");

            }
            System.out.println();
        }
    }
}