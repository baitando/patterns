package de.baitando.patterns.factorymethod;

import de.baitando.patterns.Person;

public abstract class PersonPrinter {

    public void print(Person person) {
        System.out.println(getConverter().convert(person));
    }

    abstract PersonConverter getConverter();
}
