package de.andrena;

public class MarsRover {
    private int x;
    private int y;

    public MarsRover() {
    }

    public MarsRover(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getPositition() {
        return String.valueOf(x) + " " + String.valueOf(y);
    }
}
