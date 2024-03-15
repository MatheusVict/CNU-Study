package io.matheusvictor.builder;

public class AddressBuilder {
    private Address address;

    private AddressBuilder() {
        this.address = new Address();
    }

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }

    public AddressBuilder street(String street) {
        this.address.street(street);
        return this;
    }

    public AddressBuilder complement(String complement) {
        this.address.complement(complement);
        return this;
    }

    public Address build() {
        return this.address;
    }
}
