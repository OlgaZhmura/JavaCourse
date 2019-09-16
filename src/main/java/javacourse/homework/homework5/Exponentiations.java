package javacourse.homework.homework5;

public class Exponentiations implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, right);
    }
}
