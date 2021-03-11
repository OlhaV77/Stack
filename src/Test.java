public class Test {
    public static void main(String[] args) throws PushException {
        Stack stack = new Stack(7);
        try {

            stack.push(4);
            stack.push(5);
            stack.push(8);
            stack.push(9);
            stack.push(7);
            stack.push(78);
        } catch (PushException e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        }
        catch (PopException e){
            System.out.println(e.getMessage());
        }
    }
}

