package sk.tuke.gamestudio.game.puzzle_15;

import sk.tuke.gamestudio.game.puzzle_15.consoleui.ConsoleUI;
import sk.tuke.gamestudio.game.puzzle_15.core.Field;

public class Main {
    public static void main(String[] args) {
        var field = new Field(4, 4);
        var ui = new ConsoleUI(field);
        ui.choice();
    }
}

