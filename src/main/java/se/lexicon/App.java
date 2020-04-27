package se.lexicon;

import se.lexicon.model.Person;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person();
        person.setFirstName("Erik");
        person.setLastName("Svensson");
        person.setBirthDate(LocalDate.parse("1976-09-11"));

        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Birth date: " + person.getBirthDate());



    }
}
