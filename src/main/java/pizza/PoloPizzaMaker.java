package pizza;

public class PoloPizzaMaker extends AbstractPizzaMaker{

    public PoloPizzaMaker() {
        super("Polo");
    }

    @Override
    protected void wrap() {
        System.out.println("Here's your Polo pizza");
    }

    @Override
    protected void bake() {
        System.out.println("Pizza is baking");
        try {
            Thread.sleep(12000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void putIngridients() {
        System.out.println("Put all Polo's ingridients");
    }
}
