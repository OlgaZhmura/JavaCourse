package pizza;

public class FourCheesesPizzaMaker extends AbstractPizzaMaker {

    public FourCheesesPizzaMaker() {
        super("FourCheeses");
    }

    @Override
    protected void wrap() {
        System.out.println("Here's your Four Cheeses pizza");
    }

    @Override
    protected void bake() {
        System.out.println("Pizza is baking");
        try {
            Thread.sleep(8000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void putIngridients() {
        System.out.println("Put all Four Cheeses' ingridients");
    }
}
