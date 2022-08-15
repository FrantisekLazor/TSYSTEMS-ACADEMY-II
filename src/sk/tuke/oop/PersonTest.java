package sk.tuke.oop;

public class PersonTest {
    public static void main(String[] args) {
        var p1 = new Person("Janko", "Hrasko", 21);
        var p2 = new Person("Zuzka", "Mudra", 18);
//        p2.setFirstName("Zuzka");
//        p1.setFirstName("Janko");
//        p1.setLastName("Hrasko");
//        p2.setLastName("Mudra");
        p1.setAge(12);
        p1.sayHello();
        p2.sayHello();
        var persons = new Person[3];
        persons[0] = p1;
        persons[1] = p2;
        persons[2] = new Person("Jozko", "Pucik", 29);

        for (var person : persons)
            person.sayHello();

        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
        System.out.println(p1.getAge());
        System.out.println(p2.getFirstName());
        System.out.println(p2.getLastName());
        System.out.println(p2.getAge());
        System.out.println(p1.getInitials());
    }

}

