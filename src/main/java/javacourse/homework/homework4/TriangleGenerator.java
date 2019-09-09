package javacourse.homework.homework4;

import java.util.concurrent.ThreadLocalRandom;

public class TriangleGenerator {

    public Triangle[] generateTriangles() {
        Triangle[] triangles = new Triangle[100000];
        Triangle temp;

        for (int i = 0; i < triangles.length; i++) {
            do {
                temp = new Triangle(new Point (generateNum(), generateNum()), new Point (generateNum(), generateNum()), new Point (generateNum(), generateNum()));
            } while (temp.getSquare() == 0);
            triangles[i] = temp;
        }
        return triangles;
    }

    private float generateNum(){
        float num = (float) ThreadLocalRandom.current().nextDouble(10);
        return Math.round(num * 10) / 10.f;
    }
}