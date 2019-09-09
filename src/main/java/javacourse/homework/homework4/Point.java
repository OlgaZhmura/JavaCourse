package javacourse.homework.homework4;

public class Point {

    private float x, y;

    public Point() {
        x = y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getDistance(Point point) {
        float rez = (float) Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
        return Math.round(rez * 10) / 10.f;
    }
}