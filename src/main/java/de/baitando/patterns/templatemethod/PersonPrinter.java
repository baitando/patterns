package de.baitando.patterns.templatemethod;

import de.baitando.patterns.Person;

public abstract class PersonPrinter {

    public void print(Person person) {
        System.out.println(convert(person));
    }

    protected abstract String convert(Person person);
}
