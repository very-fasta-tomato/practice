package ru.ssau.tk.collectionclasses;

import org.testng.annotations.Test;
import ru.ssau.tk.personclasses.Gender;

import java.util.Calendar;
import java.util.Date;

import static org.testng.Assert.*;

public class DriverTest {
    Driver firstDriver = new Driver();
    Driver secondDriver = new Driver();
    Driver thirdDriver = new Driver();

    public void setDrivers() {
        firstDriver.setId(1);
        firstDriver.setName("Sergey");
        firstDriver.setGender(Gender.MALE);
        firstDriver.setLicenseExpirationDate(new Date(128, Calendar.JUNE, 27));

        secondDriver.setId(2);
        secondDriver.setName("Maria");
        secondDriver.setGender(Gender.FEMALE);
        secondDriver.setLicenseExpirationDate(new Date(130, Calendar.SEPTEMBER, 3));

        thirdDriver.setId(1);
        thirdDriver.setName("Sergey");
        thirdDriver.setGender(Gender.MALE);
        thirdDriver.setLicenseExpirationDate(new Date(132, Calendar.JUNE, 25));
    }

    @Test
    public void testTestEquals() {
        setDrivers();
        assertTrue(firstDriver.equals(thirdDriver));
        assertTrue(firstDriver.equals(firstDriver));
        assertTrue(thirdDriver.equals(firstDriver));
        assertFalse(firstDriver.equals(secondDriver));
        assertFalse(firstDriver.equals(null));
    }

    @Test
    public void testTestToString() {
        setDrivers();
        assertEquals(firstDriver.toString(), "Driver. id: 1; name: Sergey; gender: MALE; licenseExpirationDate: Tue Jun 27 00:00:00 SAMT 2028");
        assertEquals(secondDriver.toString(), "Driver. id: 2; name: Maria; gender: FEMALE; licenseExpirationDate: Tue Sep 03 00:00:00 SAMT 2030");
    }
}