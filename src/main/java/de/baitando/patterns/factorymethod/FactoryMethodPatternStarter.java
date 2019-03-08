package de.baitando.patterns.factorymethod;

import de.baitando.patterns.Person;

public class FactoryMethodPatternStarter {

    public static void main(String[] args) {

        Person person = new Person("Max", "Mustermann");

        new JsonPersonPrinter().print(person);
    }
}
