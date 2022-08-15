public class ArrayCopy {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[4];

        int[] numbers2 = {2, 4, 5, 6, 5, 8, 42};

        System.arraycopy(numbers2, 0, numbers, 0, 4);

        numbers2[2] = 7;
        printArray(numbers2);
        printArray(numbers);
    }

    private static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        System.out.println("=============");
    }
}
