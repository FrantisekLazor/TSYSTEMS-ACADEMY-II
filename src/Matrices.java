public class Matrices {
    public static void main(String[] args) {
        int[][] matrixA = {
                {4, 2, 6, 4, 2},
                {3, 1, 5, 0, 8},
                {1, 8, 4, 2, 1},
                {7, 3, 2, 4, 4},
        };
        int[][] matrixB = {
                {1, 2, 8, 0, 4},
                {4, 4, 7, 4, 6},
                {5, 1, 9, 1, 3},
                {6, 3, 11, 2, 3},
        };

        int[][] addition = addMatrices(matrixA, matrixB);
        int[][] transposed = transpose(matrixA);
        int[][] multiplied = multiplyMatrices(matrixA, matrixB);

        printMatrix(matrixA);
        printMatrix(matrixB);
        printMatrix(addition);
//        printMatrix(transposed);
//        printMatrix(multiplied);
    }

    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] addition = new int[4][5];
      for (int r=0; r < 4; r++){
          for (int c=0; c < 5; c++){
              addition[r][c] =  matrixA[r][c] + matrixB[r][c];
          }

      }
        //sucet matic - kazdy prvok s kazdym prvkom
        //vysledok bude v addition
        return addition;
    }

    private static int[][] transpose(int[][] matrixA) {
        int[][] transposed = new int[4][];
        //https://cs.wikipedia.org/wiki/Transpozice_matice
        //vysledok bude v transposed
        return transposed;
    }

    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] multiplied = new int[4][];
        //https://www.math.sk/skripta/node46.html
        //vysledok bude v multiplied
        return multiplied;
    }
}
