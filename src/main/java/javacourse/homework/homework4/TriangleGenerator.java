package javacourse.homework.homework4;

import java.util.concurrent.ThreadLocalRandom;

public class TriangleGenerator {

    public Triangle[] generateTriangles() {
        Triangle[] triangles = new Triangle[100000];
        Triangle temp;
        int index = 0;

        while (index < triangles.length) {
            temp = new Triangle(new Point (generateNum(), generateNum()), new Point (generateNum(), generateNum()), new Point (generateNum(), generateNum()));
            if (temp.getSquare() != 0) {
                triangles[index] = temp;
                index++;
            }
        }
        return triangles;
    }

    private float generateNum(){
        float num = (float) ThreadLocalRandom.current().nextDouble(10);
        return Math.round(num * 10) / 10.f;
    }
}