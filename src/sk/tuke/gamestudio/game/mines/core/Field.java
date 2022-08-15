package sk.tuke.gamestudio.game.mines.core;

import java.util.Random;

public class Field {
    private final int rowCount;

    private final int columnCount;

    private final int mineCount;
    private final Tile[][] tiles;
    private int openCount;
    private FieldState state;

    public Field(int rowCount, int columnCount, int mineCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.mineCount = mineCount;
        tiles = new Tile[rowCount][columnCount];
        generate();
    }

    private void generate() {
        generateMines();
        fillWithClues();
    }

    private void generateMines() {
//        int minesPlaced = 0;
//        Random random = new Random(); // this generates random numbers for us
//        while (minesPlaced < mineCount) {
//            int x = random.nextInt(rowCount); // a number between 0 and mWidth - 1
//            int y = random.nextInt(columnCount);
//            // make sure we don't place a mine on top of another
//            if (tiles[y][x] == null) {
//                tiles[y][x] = new Mine();
//                minesPlaced++;
//            }
//        }
        var random = new Random();
        for (int minesStored = 0; minesStored < mineCount; ) {
            var row = random.nextInt(rowCount);
            var column = random.nextInt(columnCount);
            if (tiles[row][column] == null) {
                tiles[row][column] = new Mine();
                minesStored++;
            }

        }
    }

    private void fillWithClues() {

//        for (int x = 0; rowCount < 9 ; rowCount++) {
//            for (int y = 0; columnCount < 9 ; columnCount++) {
//                if (tiles [x][y] != "X"){
//                    tiles [x][y] == new Number();
//
//                }
//
//            }
//
//        }

        for (var row = 0; row < rowCount; row++) {
            for (var column = 0; column < columnCount; column++) {
                if (tiles[row][column] == null) {
                    tiles[row][column] = new Clue(countAjhacentMines(row, column));

                }

            }

        }
    }

    private int countAjhacentMines(int row, int column) {
        var count = 0;

        if (row > 0 && column > 0 && tiles[row - 1][column - 1] instanceof Mine)
            count++;
        if (row > 0 && tiles[row - 1][column] instanceof Mine)
            count++;
        if (row > 0 && column > columnCount - 1 && tiles[row - 1][column + 1] instanceof Mine)
            count++;
        if (column > 0 && tiles[row][column - 1] instanceof Mine)
            count++;
        if (column + 1 < columnCount && tiles[row][column + 1] instanceof Mine)
            count++;
        if (row + 1 < rowCount  && column > 0 && tiles[row + 1][column - 1] instanceof Mine)
        count++;
        if (row + 1 < rowCount && tiles[row + 1][column] instanceof Mine)
            count++;
        if (row + 1 < rowCount && column + 1 < columnCount && tiles[row + 1][column + 1] instanceof Mine)
            count++;

        return count;
    }


    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public int getMineCount() {
        return mineCount;
    }

    public FieldState getState() {
        return state;
    }

    public Tile getTile(int row, int column) {
        return tiles[row][column];
    }
}



