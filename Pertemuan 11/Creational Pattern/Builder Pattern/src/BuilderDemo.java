public class BuilderDemo {
    public static void main(String[] args) {
        IPizzaBuilder builder = new PizzaBuilder();
        Pizza pizza = builder.setDough("Tipis")
                .setSauce("Marinara")
                .setTopping("Keju")
                .build();
        System.out.println(pizza);
    }
}