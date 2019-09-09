package javacourse.homework.homework4;

public class Triangle {

    public static final int TYPE_ISOSCELES = 0;
    public static final int TYPE_EQUILATERAL = 1;
    public static final int TYPE_RIGHT = 2;
    public static final int TYPE_ARBITRARY = 3;

    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point p1, Point p2, Point p3) {
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    @Override
    public String toString() {
        return "Triangle [a(" + a.getX() + "; " + a.getY() +
               ") b(" + b.getX() + "; " + b.getY() +
               ") c(" + c.getX() + "; " + c.getY() + ")]";
    }

    public int getTypeTriangle() {
        if (isIsoscelesTriangle()) {
            return TYPE_ISOSCELES;
        }
        if (isEquilateralTriangle()) {
            return TYPE_EQUILATERAL;
        }
        if (isRightTriangle()) {
            return TYPE_RIGHT;
        }
            return TYPE_ARBITRARY;
    }

    public float getPerimeter() {
        float prmtr = a.getDistance(b) + b.getDistance(c) + c.getDistance(a);
        return Math.round(prmtr * 10) / 10.f;
    }

    public float getSquare() {
        float halfPrmtr = getPerimeter() / 2;
        float square = (float) Math.sqrt(halfPrmtr * (halfPrmtr - a.getDistance(b)) * (halfPrmtr - b.getDistance(c)) * (halfPrmtr - c.getDistance(a)));

        return Math.round(square * 10) / 10.f;
    }

    private boolean isIsoscelesTriangle() {
        float ab = a.getDistance(b);
        float bc = b.getDistance(c);
        float ac = a.getDistance(c);

        if (ab == bc && ab != ac) {
            return true;
        } else {
            if (bc == ac && bc != ab) {
                return true;
            } else {
                return (ab == ac && ab != bc);
            }
        }
    }

    private boolean isEquilateralTriangle() {
        float ab = a.getDistance(b);
        float bc = b.getDistance(c);
        float ac = a.getDistance(c);

        return (ab == bc && bc == ac && ab == ac);
    }

    private boolean isRightTriangle() {
        double ab = Math.round(Math.pow(a.getDistance(b), 2));
        double bc = Math.round(Math.pow(b.getDistance(c), 2));
        double ac = Math.round(Math.pow(a.getDistance(c), 2));

        if (ac == (ab + bc)) {
            return true;
        } else {
            if (bc == (ab + ac)) {
                return true;
            } else {
                return (ab == (ac + bc));
            }
        }
    }

    private boolean isArbitraryTriangle() {
        float ab = a.getDistance(b);
        float bc = b.getDistance(c);
        float ac = a.getDistance(c);

        return (ab != bc && bc != ac && ab != ac && !isRightTriangle());
    }
}