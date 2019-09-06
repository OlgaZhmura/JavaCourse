package pizza;

public interface PizzaMakerFactory {
    AbstractPizzaMaker getPizzaMaker(Buttons button);
}
