package de.baitando.patterns.factorymethod;

public class JsonPersonPrinter extends PersonPrinter {

    private PersonConverter personConverter;

    @Override
    PersonConverter getConverter() {
        if(personConverter == null) {
            personConverter = new JsonPersonConverter();
        }

        return personConverter;
    }
}
