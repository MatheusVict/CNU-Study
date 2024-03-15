package io.matheusvictor.builder;

public class Address {
    private String street;
    private String complement;

    protected Address() {
    }

    public static Address builder() {
        return new Address();
    }

    public Address street(String street) {
        this.street = street;
        return this;
    }

    public Address complement(String complement) {
        this.complement = complement;
        return this;
    }



    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", complement='" + complement + '\'' +
                '}';
    }
}
