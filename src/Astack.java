public class Astack {
    public static void main(String[] args) throws PushException {

        Stack aStack = new Stack();
        aStack = new Stack(aStack.size = 6);
        try {
            aStack.push(1);
            aStack.push(2);
            aStack.push(5);
            aStack.push(2);
            aStack.push(9);
            aStack.push(3);
        } catch (PushException e) {
            System.out.println(e.getMessage());
        }

        try {
            aStack.pop();
            aStack.pop();
            aStack.pop();
            aStack.pop();
            aStack.pop();
            aStack.pop();
            aStack.pop();
        } catch (PopException e) {
            System.out.println(e.getMessage());
        }
    }
}
