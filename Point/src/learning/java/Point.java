package learning.java;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return (double) Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    public double distance(int x, int y) {
        return (double) Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point xy) {
        return (double) Math.sqrt((xy.getX() - this.x) * (xy.getX() - this.x) + (xy.getY() - this.y) * (xy.getY() - this.y));
    }
}
