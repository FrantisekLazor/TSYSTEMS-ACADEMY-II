package sk.tuke.gamestudio.game.puzzle_15.core;

import java.util.Random;

public class Field {

    private final int rowCount;

    private final int columnCount;

    public Tile[][] tiles;

    public Field(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        tiles = new Tile[rowCount][columnCount];
        generate();
    }


    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    private void generate() {
        fillWithNumbers();
    }

    private void fillWithNumbers() {
        var random = new Random();
//        int i = 1;
//        for (var tile : tiles) {
            var row = random.nextInt(rowCount);
            var column = random.nextInt(columnCount);

            }
        }


    public void play() {
        printField();
//        do {
//            printField();
//            processInput();
//        } while (field.getState() == FieldState.PLAYING);
//        printField();
//        System.out.println(field.getState());
    }

    private void printField() {
        for (var row = 0; row < rowCount; row++) {
            for (var column = 0; column < columnCount; column++) {
                if (tiles[row][column] == null) {
                    tiles[row][column] = new Clue(countTiles(row, column));

                }
            }
        }
    }
    private int countTiles (int row, int column) {
        var count = 0;

        if (row > 0 && column > 0 && tiles[row][column] instanceof Tile)
            count++;
        if (row > 0 && tiles[row + 1][column] instanceof Tile)
            count++;
        if (row > 0 && column + 1 < columnCount && tiles[row - 1][column + 1] instanceof Mine)
            count++;
        if (column > 0 && tiles[row][column - 1] instanceof Mine)
            count++;
        if (column + 1 < columnCount && tiles[row][column + 1] instanceof Mine)
            count++;
        if (row + 1 < rowCount && column > 0 && tiles[row + 1][column - 1] instanceof Mine)
            count++;
        if (row + 1 < rowCount && tiles[row + 1][column] instanceof Mine)
            count++;
        if (row + 1 < rowCount && column + 1 < columnCount && tiles[row + 1][column + 1] instanceof Mine)
            count++;

        return count;
    }
}
