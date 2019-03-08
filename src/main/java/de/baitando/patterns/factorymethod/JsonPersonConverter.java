package de.baitando.patterns.factorymethod;

import de.baitando.patterns.Person;

public class JsonPersonConverter implements PersonConverter {

    @Override
    public String convert(Person person) {

        String result = "{\n";
        result += "  'firstName': '" + person.getFirstName() + "',\n";
        result += "  'lastName': '" + person.getLastName() + "'\n";
        result += "}";

        return result;
    }
}
