package sk.tuke.gamestudio.game.mines.core;

import java.util.Random;

public class Field {
    private final int rowCount;

    private final int columnCount;

    private final int mineCount;

    private int openCount;

    private FieldState state;

    private final Tile[][] tiles;

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
        var random = new Random();
        var mineStored = 0;
        while (mineStored < mineCount) {
            var row = random.nextInt(rowCount);
            var column = random.nextInt(columnCount);
            if (tiles[row][column] == null) {
                tiles[row][column] = new Mine();
                mineStored++;
            }
        }
    }

    private void fillWithClues() {
        for (var row = 0; row < rowCount; row++) {
            for (var column = 0; column < columnCount; column++) {
                if (tiles[row][column] == null) {
                    tiles[row][column] = new Clue(countAdjacentMines(row, column));
                }
            }
        }
    }

    private int countAdjacentMines(int row, int column) {
        var count = 0;
        if (row > 0) {
            if (column > 0 && tiles[row - 1][column - 1] instanceof Mine)
                count++;
            if (tiles[row - 1][column] instanceof Mine)
                count++;
            if (column + 1 < columnCount && tiles[row - 1][column + 1] instanceof Mine)
                count++;
        }

        if (column > 0 && tiles[row][column - 1] instanceof Mine)
            count++;
        if (column + 1 < columnCount && tiles[row][column + 1] instanceof Mine)
            count++;

        if (row + 1 < rowCount) {
            if (column > 0 && tiles[row + 1][column - 1] instanceof Mine)
                count++;
            if (tiles[row + 1][column] instanceof Mine)
                count++;
            if (column + 1 < columnCount && tiles[row + 1][column + 1] instanceof Mine)
                count++;
        }

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
