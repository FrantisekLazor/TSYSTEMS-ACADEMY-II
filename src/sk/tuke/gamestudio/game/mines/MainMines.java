package sk.tuke.gamestudio.game.mines;

import sk.tuke.gamestudio.game.mines.consoleui.ConsoleUI;
import sk.tuke.gamestudio.game.mines.core.Field;

public class MainMines {
    public static void main() {
       var field = new Field(9,9,10);
       var ui =new ConsoleUI(field);
       ui.play();
    }
}
