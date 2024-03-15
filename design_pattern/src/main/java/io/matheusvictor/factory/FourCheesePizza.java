package io.matheusvictor.factory;

import java.util.List;

public class FourCheesePizza extends Pizza{

    protected FourCheesePizza() {
        this.ingredients = List.of(
                new Ingredient("Mussarela"),
                new Ingredient("Latino"),
                new Ingredient("cheese")
        );
    }
}
