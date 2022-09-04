package sk.tuke.gamestudio.game.mines.core;

import java.util.Random;

public class Field {
    private final int rowCount;
    private final int columnCount;
    private final int mineCount;
    private final Tile[][] tiles;
    private int openCount;
    private FieldState state = FieldState.PLAYING;

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

    public void openTile(int row, int column) {
        var tile = tiles[row][column];
        if (tile.getState() == TileState.CLOSED) {
            tile.setState(TileState.OPEN);
            openCount++;

            if (tile instanceof Mine) {
                state = FieldState.FAILED;
                return;
            }
            if (((Clue) tile).getValue() == 0)
                openAdjacnetTiles(row, column);

            if (rowCount * columnCount - mineCount == openCount)
                state = FieldState.SOLVED;

//            if (state == FieldState.SOLVED)
//                saveResults();

        }
    }

//    private void saveResults() {
//        try (var connection = createConnection()) {
//            try (var statement = connection.createStatement()) {
//                statement.executeUpdate("DELETE FROM score");
//            }
//            try (var statement = connection.prepareStatement(
//                    "INSERT INTO score (user_name, game, score) VALUES (?, ?, ?)")) {
//                for (var score : score) {
//                    statement.setString(1, System.getProperty("user.name"));
//                    statement.setString(2, "mines");
//                    statement.setString(3, score());
//                    statement.executeUpdate();
//                }
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException("Error saving score", e);
//        }
//    }
//
//    private String score() {
//        long startTime = System.nanoTime();
//        MainMines.main();
//        long endTime   = System.nanoTime();
//        long totalTime = endTime - startTime;
//        System.out.println(totalTime);
//    }
//
//    private Connection createConnection() throws SQLException {
//        return DriverManager.getConnection(
//                "jdbc:postgresql://localhost/gamingscores", "postgres", "postgres");
//    }


    public void markTile(int row, int column) {
        var tile = tiles[row][column];
        if (tile.getState() == TileState.CLOSED)
            tile.setState(TileState.MARKED);
        else if (tile.getState() == TileState.MARKED)
            tile.setState(TileState.CLOSED);
    }

    private void openAdjacnetTiles(int row, int column) {
        if (row > 0) {
            if (column > 0)
                openTile(row - 1, column - 1);
            openTile(row - 1, column);

            if (column + 1 < columnCount) {
                openTile(row - 1, column + 1);
            }
        }

        if (column > 0)
            openTile(row, column - 1);
        if (column + 1 < columnCount)
            openTile(row, column + 1);

        if (row + 1 < rowCount) {
            if (column > 0)
                openTile(row + 1, column - 1);

            openTile(row + 1, column);
            if (column + 1 < columnCount)
                openTile(row + 1, column + 1);
        }
    }
}



