package sk.tuke.traffic;

public class Person {
    private Person firstname;

    private Person lastname;



    public Person(Person firstname, Person lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public Person getFirstname() {
        return firstname;
    }

    public Person getLastname() {
        return lastname;
    }


}
