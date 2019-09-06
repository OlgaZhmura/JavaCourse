package pizza;

public class PizzaAutomat {

    public static void main(String[] args) {
        UkrainePizzaMakerFactory pizzaMakerFactory = new UkrainePizzaMakerFactory();
        String pizza = pizzaMakerFactory.getPizzaMaker(Buttons.B)
                         .makePizza();
        System.out.println(pizza);
        System.out.println("");

        DneprPizzaMakerFactory dneprPizzaMakerFactory = new DneprPizzaMakerFactory();
        pizza = dneprPizzaMakerFactory.getPizzaMaker(Buttons.D)
                                 .makePizza();
        System.out.println(pizza);
    }

}
