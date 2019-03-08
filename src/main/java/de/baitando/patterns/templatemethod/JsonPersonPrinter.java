package de.baitando.patterns.templatemethod;


import de.baitando.patterns.Person;

public class JsonPersonPrinter extends PersonPrinter {


    @Override
    protected String convert(Person person) {
        String result = "{\n";
        result += "  'firstName': '" + person.getFirstName() + "',\n";
        result += "  'lastName': '" + person.getLastName() + "'\n";
        result += "}";

        return result;
    }
}
