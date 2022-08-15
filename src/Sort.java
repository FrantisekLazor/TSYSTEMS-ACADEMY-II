import java.util.Arrays;

public class Sort {
    private static long startTime;
    private static long endTime;
    private static int iteration = 0;

    public static void main(String[] args) {
//        int[] numbers = {1, 5, 20, 18, 97, 3, -17, 4};
        int[] numbers = {100, 25, 20, 18, 97, 3, -17, 4, 154, 87, 95, 24, -20, 64, -78, -9, 0, 1574, 2000, -155};
        int[] numbers2 = new int[numbers.length];
        int[] numbers3 = new int[numbers.length];
        System.arraycopy(numbers, 0, numbers2, 0, 20);
        System.arraycopy(numbers, 0, numbers3, 0, 20);

        /* sort from lowest to highest number */
        recordStart();
        selectionSort(numbers);
        recordAndWriteEnd();

        recordStart();
        bubbleSort(numbers2);
        recordAndWriteEnd();

        recordStart();
        Arrays.sort(numbers3);
        recordAndWriteEnd();
    }

    // {100, 25, 20, 18, 97, 3, -17, 4};
    // {25, 100, 20, 18, 97, 3, -17, 4};
    // {25, 20, 100, 18, 97, 3, -17, 4};
    // {25, 20, 18, 100, 97, 3, -17, 4};
    // {25, 20, 18, 97, 100, 3, -17, 4};
    // {25, 20, 18, 97, 3, 100, -17, 4};
    // {25, 20, 18, 97, 3, -17, 100, 4};
    // {25, 20, 18, 97, 3, -17, 4, 100};
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = 0; j < array.length - i - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
//        printArray(array);
    }

    // {100, 25, 20, 18, 97, 3, -17, 4};
    // {25, 100, 20, 18, 97, 3, -17, 4};
    // {20, 100, 25, 18, 97, 3, -17, 4};
    // {18, 100, 25, 20, 97, 3, -17, 4};
    // {3, 100, 25, 20, 97, 18, -17, 4};
    // {-17, 100, 25, 20, 97, 18, 3, 4};
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
//        printArray(array);
    }

    private static void recordStart() {
        startTime = System.currentTimeMillis();
    }

    private static void recordAndWriteEnd() {
        endTime = System.currentTimeMillis();
        System.out.println("Loop " + ++iteration + " duration: "
                + (endTime - startTime) + " milliseconds");
    }

    private static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        System.out.println("=============");
    }
}
