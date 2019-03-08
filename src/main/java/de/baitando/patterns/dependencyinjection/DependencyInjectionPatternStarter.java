package de.baitando.patterns.dependencyinjection;

import de.baitando.patterns.Person;

public class DependencyInjectionPatternStarter {

    public static void main(String[] args) {

        Person person = new Person("Max", "Mustermann");

        new PersonPrinter(new JsonPersonConverter()).print(person);
    }
}
