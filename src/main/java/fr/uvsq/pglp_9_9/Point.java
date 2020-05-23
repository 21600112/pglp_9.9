package fr.uvsq.pglp_9_9;

public class Point {

    private int x;
    private int y;

    public Point(final int pX, final int pY) {
        this.x = pX;
        this.y = pY;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
       return this.y;
    }


    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
