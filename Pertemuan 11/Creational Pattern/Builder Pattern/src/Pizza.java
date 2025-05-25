public class Pizza {
    private final String dough;
    private final String sauce;
    private final String topping;

    public Pizza(String dough, String sauce, String topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza dengan " + dough + ", " + sauce + ", " + topping;
    }
}