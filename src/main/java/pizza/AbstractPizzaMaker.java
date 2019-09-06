package pizza;

public abstract class AbstractPizzaMaker {
    private final String pizzaName;

    protected AbstractPizzaMaker(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String makePizza() {
       takeDough();
       putIngridients();
       bake();
       slice();
       wrap();
       return pizzaName;
    }

    protected abstract void wrap();

    protected abstract void bake();

    protected abstract void putIngridients();

    private void slice() {
        System.out.println("Sliced to 6 pieces");
    }

    private void takeDough() {
        System.out.println("Took dough and put sauce");
    }
}
