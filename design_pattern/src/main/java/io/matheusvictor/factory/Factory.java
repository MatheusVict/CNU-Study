package io.matheusvictor.factory;

public class Factory {
    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.getInstance(true);
        Pizza pizza2 = PizzaFactory.getInstance(false);

        System.out.println(pizza);
        System.out.println(pizza2);
    }
}
