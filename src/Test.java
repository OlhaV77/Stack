public class Test {
    public static void main(String[] args) {
        Stack[] stack = new Stack[5];
        stack[0] = new Stack();
        try {

            int[] storage = {0, 9, 8, 7, 78, 45, 34};
            for (int i = 0; i < storage.length; i++) {
                stack[0].push(storage[i]);
            }

        } catch (InnerPush.PushException e) {
            System.out.println(e.getMessage());
        }

        try {
            int i = 0;
            while ((i < 6)) {
                stack[0].pop();
                i++;
            }
        } catch (InnerPop.PopException e) {
            System.out.println(e.getMessage());
        }
    }
}
