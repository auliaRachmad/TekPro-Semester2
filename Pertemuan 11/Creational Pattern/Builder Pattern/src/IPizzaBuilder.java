public interface IPizzaBuilder {
    IPizzaBuilder setDough(String dough);
    IPizzaBuilder setSauce(String sauce);
    IPizzaBuilder setTopping(String topping);
    Pizza build();
}