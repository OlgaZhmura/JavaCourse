package pizza;

public class DneprPizzaMakerFactory implements PizzaMakerFactory {

    @Override
    public AbstractPizzaMaker getPizzaMaker(Buttons button) {
        switch (button) {
            case A:
                return new PoloPizzaMaker();
            case B:
                return new FourCheesesPizzaMaker();
            case C:
                return new CarbonaraPizzaMaker();
            case D:
                return new PepperoniPizzaMaker();
        }
        return null;
    }
}
