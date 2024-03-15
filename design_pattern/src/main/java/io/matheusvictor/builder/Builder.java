package io.matheusvictor.builder;

public class Builder {
    public static void main(String[] args) {
        Address address = Address
                .builder()
                .complement("oi")
                .street("oi");

        Address address1 = AddressBuilder
                .builder()
                .street("171")
                .complement("d")
                .build();

        System.out.println(address);
        System.out.println(address1);
    }
}
