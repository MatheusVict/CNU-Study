package io.matheusvictor.strategy;

public class Strategy {
    public static void main(String[] args) {
        Person person1 = new Person("99999999999", 18);
        validPerson(person1, new PhysicalPersonValidator());
        validPerson(person1, new GreaterThan18Year());

        Person person2 = new Person("99999999999999", 17);
        validPerson(person2, new LegalPersonValidator());
        validPerson(person2, new GreaterThan18Year());
    }

    public static void validPerson(Person person, IValidator validator) {
        validator.validate(person);
    }

    interface IValidator {
        void validate(Person person);
    }

    private static class PhysicalPersonValidator implements IValidator {

        @Override
        public void validate(Person person) {
            if (person.getRegistry().length() > 11) throw new IllegalArgumentException("Cpf problem");
        }
    }

    private static class LegalPersonValidator implements IValidator {

        @Override
        public void validate(Person person) {
            if (person.getRegistry().length() < 14) throw new IllegalArgumentException("Invalid cnpj");
        }
    }

    private static class GreaterThan18Year implements IValidator {

        @Override
        public void validate(Person person) {
            if (person.getAge() < 18) throw new IllegalArgumentException("Wrong age");
        }
    }
}
