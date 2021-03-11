public class Test {
    private int position;
    private int[] storage;
    private int size;

    Test(int size) {
        this.size = size;
        this.storage = new int[size];
    }

    public int increase() {
        int newSize = size + 5;
        if(size < newSize){     //6<11

            for(int i = 0; i < 5; i++) {
                size++;
                System.out.println(size);
            }
        }
        return size ;
    }

    public static void main(String[] args) {
        Test test = new Test(6);
        test.increase();

    }
}

