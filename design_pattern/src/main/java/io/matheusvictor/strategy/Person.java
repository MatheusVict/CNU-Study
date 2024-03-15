package io.matheusvictor.strategy;

public class Person {
    private String registry;
    private int age;

    public Person(String registry, int age) {
        this.registry = registry;
        this.age = age;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
