package sk.tuke.gamestudio.game.puzzle_15.consoleui;

import sk.tuke.gamestudio.game.puzzle_15.core.Field;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ConsoleUI {

    private Field field;

    private Scanner scanner = new Scanner(System.in);

    public ConsoleUI(Field field) {
        this.field = field;
    }

    public void choice() {
        System.out.println("1. PLAY");
        System.out.println("2. EXIT");
        System.out.println("Enter input: ");
        var line = scanner.nextLine().trim();
        if ("2".equals(line))
            System.exit(0);

        if ("1".equals(line)) {
            field.play();

        }


//        System.out.print("Enter input: ");
//        var line = ui.scaner.nextLine().trim();
//    }


//            ui.play();
//        var pattern = Pattern.compile("([1-9])([1-9])");
//        var matcher = pattern.matcher(line);
//        if(matcher.matches()){
//            var row = matcher.group(2).charAt(0) - 'A';   //riadok od nuly
//            var column = Integer.parseInt(matcher.group(3)) - 1;  //stlpec od nuly
//            if("O".equals(matcher.group(1)))
//                field.openTile(row,column);
//            else
//                field.markTile(row,column);
//
//        }else {
//            System.err.println("Invalid input!");
//        }


    }


}

