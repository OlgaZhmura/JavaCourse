package pizza;

public class UkrainePizzaMakerFactory implements PizzaMakerFactory{
    public AbstractPizzaMaker getPizzaMaker(Buttons button) {
        switch (button) {
            case A:
                return new CarbonaraPizzaMaker();
            case B:
                return new PepperoniPizzaMaker();
            case C:
                return new PoloPizzaMaker();
            case D:
                return new FourCheesesPizzaMaker();
        }
        return null;
    }
}
