package pizza;

public class PepperoniPizzaMaker extends AbstractPizzaMaker{

    public PepperoniPizzaMaker() {
        super("Pepperoni");
    }

    @Override
    protected void wrap() {
        System.out.println("Here's your Pepperoni pizza");
    }

    @Override
    protected void bake() {
        System.out.println("Pizza is baking");
        try {
            Thread.sleep(11000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void putIngridients() {
        System.out.println("Put all Pepperoni's ingridients");
    }
}
