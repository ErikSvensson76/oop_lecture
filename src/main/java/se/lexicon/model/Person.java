package se.lexicon.model;

import java.time.LocalDate;

//Person class is the blueprint for Person objects
public class Person {

    private String firstName;       //Field
    private String lastName;        //Field
    private LocalDate birthDate;    //Field

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }
}
