package de.baitando.patterns.dependencyinjection;

import de.baitando.patterns.Person;

public class PersonPrinter {

    private PersonConverter personConverter;

    public PersonPrinter(PersonConverter personConverter) {
        this.personConverter = personConverter;
    }


    public void print(Person person) {
        System.out.println(this.personConverter.convert(person));
    }
}
