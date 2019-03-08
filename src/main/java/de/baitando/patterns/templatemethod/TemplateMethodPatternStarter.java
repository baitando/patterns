package de.baitando.patterns.templatemethod;

import de.baitando.patterns.Person;

public class TemplateMethodPatternStarter {

    public static void main(String[] args) {

        Person person = new Person("Max", "Mustermann");

        new JsonPersonPrinter().print(person);
    }
}
