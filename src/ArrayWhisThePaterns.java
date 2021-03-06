public class ArrayWhisThePaterns {
    public static void main(String[] args) {
        ArrayWithThePattern pattern = new ArrayWithThePattern();

        pattern.seriesUp(4);
    }

    public int[] seriesUp(int num) {

        int[] storage = new int[num * (num + 1) / 2];
        int count = 0;

        for (int i = 0; i <= num; i++) {

            for (int j = 1; j <= count; j++) {
                storage[count] = j;
                System.out.print(storage[count] + "  " );
            }
            count++;
        }
        return storage;
    }
}



/*
    Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
    (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
     which is known to sum to exactly n*(n + 1)/2.


        seriesUp(3) → [1, 1, 2, 1, 2, 3]
        seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        seriesUp(2) → [1, 1, 2]


 */