package sk.tuke.register;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void testCreatePerson() {
        var person = new Person("Janko","123");
        assertEquals("Janko", person.getName());
        assertEquals("123", person.getPhoneNumber());
    }

    @Test
    public void testSetPhoneNumberValid() {
        var person = new Person("Janko", "0904556234");
        assertEquals("0904556234", person.getPhoneNumber());
    }

    @Test(expected = RegisterException.class)
    public void testSetPhoneNumberInvalid1() {
        new Person("Janko", "4556m234");
    }

    @Test(expected = RegisterException.class)
    public void testSetPhoneNumberInvalid2() {
        new Person("Janko", "12");
    }

    @Test(expected = RegisterException.class)
    public void testSetPhoneNumberInvalid3() {
        new Person("Janko", "1231231231235");
    }

    @Test
    public void testEmailAdressIsValid() {
        var person = new Person("Janko", "0904556234");
        assertEquals("0904556234", person.getPhoneNumber());
    }
}
