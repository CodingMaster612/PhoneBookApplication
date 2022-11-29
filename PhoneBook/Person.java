package PhoneBook;

import java.util.Scanner;

public class Person {
    private String person;
    private String firstName;
    private String lastName;

    public Person() {
        super();
    }

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + lastName;
    }
}
