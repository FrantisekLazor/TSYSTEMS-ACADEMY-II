package sk.tuke.gamestudio.game.mines;

import sk.tuke.gamestudio.game.mines.core.Clue;
import sk.tuke.gamestudio.game.mines.core.Field;

public class Main {
    public static void main(String[] args) {
        var field = new Field(4, 4, 8);
        for (var row = 0; row < field.getRowCount(); row++) {
            for (var column = 0; column < field.getColumnCount(); column++) {
                var tile = field.getTile(row, column);
                System.out.print(" ");
                switch (tile.getState()) {
                    case CLOSED:
                        System.out.print("-");
                        break;
                    case MARKED:
                        System.out.print("M");
                        break;
                    case OPEN:
                        if (tile instanceof Clue)
                            System.out.print(((Clue) tile).getValue());
                        else
                            System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
