package pizza;

public class CarbonaraPizzaMaker extends AbstractPizzaMaker {

    public CarbonaraPizzaMaker() {
        super("Carbonara");
    }

    @Override
    protected void wrap() {
        System.out.println("Here's your Carbonara pizza");
    }

    @Override
    protected void bake() {
        System.out.println("Pizza is baking");
        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void putIngridients() {
        System.out.println("Put all Carbonara's ingridients");
    }
}
