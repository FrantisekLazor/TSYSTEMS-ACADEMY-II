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
        var x = columnCount * rowCount;
        for (var i = 0; i < tiles.length; i++) {
            for (var j = 0; j < tiles[i].length; j++) {
                tiles[i][j] = i + j;
//                System.out.print(i + 1 + "\t");
//                i++;
            }

//            System.out.println("\n");

        }

        for (int[] a : tiles) {
            for (int i : a) {
                        System.out.print(i + 1 + "\t");
                        i++;
                    }

                    System.out.println("\n");

                }


            }
        }



