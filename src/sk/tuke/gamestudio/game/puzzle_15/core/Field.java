package sk.tuke.gamestudio.game.puzzle_15.core;

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
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                tiles[i][j] = x;
                System.out.print(x + "\t");
                x++;
            }
            System.out.println();
        }
        shuffleFIeld();
    }

    private void shuffleFIeld() {
    }
}



