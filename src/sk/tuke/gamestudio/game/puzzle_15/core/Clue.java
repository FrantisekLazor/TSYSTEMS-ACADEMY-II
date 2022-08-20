package sk.tuke.gamestudio.game.puzzle_15.core;

public class Clue extends Tile {
    private final int value;

    public Clue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
