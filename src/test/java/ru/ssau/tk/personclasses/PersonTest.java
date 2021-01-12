package ru.ssau.tk.personclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void testGetterAndSetter() {
        Person person1 = new Person();
        person1.setFirstName("Wasd");
        person1.setLastName("Qwerty");
        person1.setPassportId(1234);
        assertEquals(person1.getPassportId(), 1234, 0.001);
        assertEquals(person1.getFirstName(), "Wasd");
        assertEquals(person1.getLastName(), "Qwerty");
    }

    @Test
    public void testGetFirstName() {
        Person somePerson = new Person();
        somePerson.setFirstName("Gaius");
        assertEquals(somePerson.getFirstName(), "Gaius");

        somePerson.setFirstName("William");
        assertNotEquals(somePerson.getFirstName(), "Gaius");
        assertEquals(somePerson.getFirstName(), "William");
    }

    @Test
    public void testGetLastName() {
        Person somePerson = new Person();
        somePerson.setLastName("Iulius");
        assertEquals(somePerson.getLastName(), "Iulius");

        somePerson.setLastName(null);
        assertNotEquals(somePerson.getLastName(), "Gaius");
        assertEquals(somePerson.getLastName(), null);
    }

    @Test
    public void testGetPassportId() {
        Person somePerson = new Person();
        assertNotEquals(somePerson.getPassportId(), 44);
        somePerson.setPassportId(44);

        somePerson.setPassportId(1066);
        assertNotEquals(somePerson.getPassportId(), 1036);
        assertEquals(somePerson.getPassportId(), 1066);
    }

    @Test
    public void testGender() {
        Person somePerson = new Person("Fname", "Lname", 111, Gender.MALE);
        assertEquals(somePerson.getGender(), Gender.MALE);
        somePerson.setGender(Gender.FEMALE);
        assertEquals(somePerson.getGender(), Gender.FEMALE);
        assertNotEquals(somePerson.getGender(), Gender.MALE);
    }
}