package sk.tuke.register;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegisterTest {

    @Test
    public void findPersonByName(){
        var person = new Person("Janko", "123");
        assertEquals("Janko", person.getName());
    }
    @Test
    public void findPersonByPhoneNumber(){
        var person = new Person("Janko","123");
        assertEquals("123", person.getPhoneNumber());
    }

    @Test
//    public void removePerson(){
//        var person = new Person("Janko",);
//        assertEquals("123", person.getPhoneNumber());
//    }


}