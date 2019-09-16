package javacourse.homework.homework5;

public class BinaryOperationFactory {

    public BinaryOperation getOperationFor(Operator operator) {
        switch (operator) {
            case PLUS:
                return new Addition();
            case MINUS:
                return new Substraction();
            case MULTIPLICATION:
                return new Multiplication();
            case DIVISION:
                return new Division();
            case EXPONENTION:
                return new Exponentiations();
            case SQRT:
                return new RootOfNumber();
            case LOG:
                return new Logarithm();
            default:
                System.out.println("Unknown operation " + operator);
                return null;
        }
    }
}