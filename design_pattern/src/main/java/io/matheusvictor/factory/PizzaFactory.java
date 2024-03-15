package io.matheusvictor.factory;

public class PizzaFactory {
    private PizzaFactory() {}

    public static Pizza getInstance(boolean isDelicious) {
        return isDelicious ? new PepperoniPizza(): new FourCheesePizza();
    }
}
