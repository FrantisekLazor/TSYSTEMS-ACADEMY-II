package sk.tuke.gamestudio.game.tiles;

import sk.tuke.gamestudio.game.tiles.consoleui.ConsoleUI;
import sk.tuke.gamestudio.game.tiles.core.Field;

public class MainPuzzle {
    public static void main() {
        var field = new Field(10, 10);
        var ui = new ConsoleUI(field);
        ui.play();
    }
}
