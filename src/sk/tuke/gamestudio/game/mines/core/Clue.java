package sk.tuke.gamestudio.game.mines.core;

public class Clue extends Tile {

    private final int value;    /// final ta hodnota sa neda menit

    public Clue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
