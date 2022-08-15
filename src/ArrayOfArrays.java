public class ArrayOfArrays {
    public static void main(String[] args) {
        int[][] rows = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] row : rows) {
            for (int number : row) {
                System.out.print(number);
            }
            System.out.println();
        }

        int[][] matrix = new int[3][3];
        for (int column = 0; column < matrix.length; column++) {
            for (int row = 0; row < matrix[column].length; row++) {
                matrix[column][row] = column + row;
            }
        }

        for (int column = 0; column < matrix.length; column++) {
            for (int row = 0; row < matrix[column].length; row++) {
                System.out.print(matrix[column][row]);
            }
            System.out.println();
        }

        // another way of initializing array of arrays

        int[][] arrayOfArrays = new int[4][];

        for (int i = 0; i < arrayOfArrays.length; i++) {
            arrayOfArrays[i] = new int[2];
        }

        for (int[] arrayOfArray : arrayOfArrays) {
            for (int i : arrayOfArray) {
                System.out.println(i);
            }
        }
    }
}
