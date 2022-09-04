package sk.tuke.gamestudio.game;

import sk.tuke.gamestudio.game.mines.MainMines;
import sk.tuke.gamestudio.game.tiles.MainPuzzle;


import java.util.Scanner;

public class GameStudioConsole {
    public static void main(String[] args) {

        System.out.println("Welcome  " + System.getProperty("user.name"));
//        Thread.sleep(1000);
        System.out.println("Thank you for choosing this gaming platform");
//        Thread.sleep(1000);
        System.out.println("Please make a choice from list below");

        menu();
    }

    public static void menu() {
        var minesMain = new MainMines();
        var puzzleMain = new MainPuzzle();
        var scanner = new Scanner(System.in);
        System.out.println("1. PLAY MINES");
        System.out.println("2. PLAY TILES");
        System.out.println("3. PLAY LIGHTS OUT");
        System.out.println("X. EXIT");
        System.out.print("Enter input: ");
        var line = scanner.nextLine().toUpperCase().trim();


        switch (line) {
            case "1" -> MainMines.main();
            case "2" -> MainPuzzle.main();
            // case "3" -> MainLightsOut.main();
            case "X" -> System.exit(1);
        }
    }
}

