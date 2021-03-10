public class Test {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.increase();
        test.decrease();
    }
}

class Test1 {

    void increase() {

        Stack[] stacks = new Stack[10];
        stacks[1] = new Stack();



            int size = 0;
            int[] storage;
            int num = 2;

            while (size < 6) {

                storage = new int[size];
                for (int i = 0; i < size; i++) {
                   // stacks[1].push(storage[i]);
                }
                num++;
                size++;
            }
    }

    void decrease() {
        Stack[] stacks = new Stack[10];
        stacks[1] = new Stack();

            int i = 0;
            while ((i < 6)) {
               // stacks[1].pop();
                i++;
            }
    }
}







