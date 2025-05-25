public class PizzaBuilder implements IPizzaBuilder {
    private String dough;
    private String sauce;
    private String topping;

    @Override
    public IPizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public IPizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public IPizzaBuilder setTopping(String topping) {
        this.topping = topping;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(dough, sauce, topping);
    }
}