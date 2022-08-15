package sk.tuke.traffic;

public class Car {
private String spz;

protected Person person;

    public Car(String spz, Person person) {
        this.spz = spz;
        this.person = person;
    }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public void whoIsDriver (){
        System.out.println();
    }
}
