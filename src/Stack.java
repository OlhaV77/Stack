
import java.util.Stack;

class Run {

    static void stack_push(Stack stack, Integer x) {
        stack.push(x);
        System.out.println("push -> " + x);
        System.out.println("stack " + stack);
    }

    static void stack_pop(Stack stack) {
        Integer x = (Integer) stack.pop();
        System.out.println("pop -> " + x);
        System.out.println("stack" + stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        int[] x = new int[]{56, 34, 1, 45, 7};
        for (int j = 0; j < x.length; j++) {
            if (x.length <= 5) {
                stack_push(stack, x[j]);
            }
        }
        if (x.length >= 6) {
            System.out.println("Can't add anymore");
        }

        System.out.println();
        for (int i = 0; i < x.length; i++) {
            stack_pop(stack);
        }
        if (x.length == 0) {
            System.out.println("There is nothing on the stack");
        }


    }
}