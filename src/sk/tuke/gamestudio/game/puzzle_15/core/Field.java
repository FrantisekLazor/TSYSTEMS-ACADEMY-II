package sk.tuke.gamestudio.game.puzzle_15.core;

import java.util.Arrays;
import java.util.Random;

public class Field {

    private final int rowCount;

    private final int columnCount;

    int[][] tiles;

    public Field(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        tiles = new int[rowCount][columnCount];

    }


    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void play() {
        printField();
    }

    private void printField() {
        int x = 1;
        int z = tiles.length - 1;
        int y = rowCount * columnCount;

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                tiles[i][j] = x;
                System.out.print(x + "\t");
                x++;
                if (x == 16) {
                    break;
                }

            }
//            System.out.println();
        }
        shuffleFIeld();
        System.out.println();
    }

    private void shuffleFIeld() {
//
//        Random rand = new Random();
//
//        for (int i = 0; i < tiles.length; i++) {
//            for (int j = 0; j < tiles[i].length; j++) {
//                var row = rand.nextInt(rowCount);
//                var column = rand.nextInt(columnCount);
//            }
//        }

        Random rand = new Random();

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++){
                var randomIndexToSwap = rand.nextInt(tiles.length);
                var f = tiles[randomIndexToSwap];
                tiles[randomIndexToSwap] = tiles[i][j];
                tiles[i][j] = f;
            }
            System.out.println(Arrays.toString(tiles));
        }


    }
//        System.out.println(Arrays.toString(tiles));
}




