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
        assertEquals(person1.getPassportId(),1234,0.001);
        assertEquals(person1.getFirstName(),"Wasd");
        assertEquals(person1.getLastName(),"Qwerty");
    }
}