
class Run {
    public static void main(String[] args) {
        //int[] pushArg = new int[]{56, 34, 1, 45, 7};
        Stack[] stack = new Stack[5];
       stack.toString();

    }
}

class Stack {
           int[] push;

           Stack(int[] pushArg){
               push = pushArg;

            }

            public void push(int[] push) {

            int index = 0;
            for (int j = 0; j < 5; j++) {
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

        public void pop(int[] pop) {
            int index = 0;
            System.out.println();
            for (int i = pop.length - 1; i >= 0; i--) {
                index++;
                System.out.println("pop -> " + pop[i]);

                if (pop.length == 0) {
                    System.out.println("There is nothing on the stack");
                }
                System.out.print("stack -> ");
                for (int j = 0; j < pop.length - index; j++) {
                    System.out.print(pop[j] + " ");

                }
                System.out.println();
            }
        }

    @Override
    public String toString() {
        return super.toString();
    }
}

