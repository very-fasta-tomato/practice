package ru.ssau.tk.collectionclasses;

import ru.ssau.tk.personclasses.Gender;

import java.util.Date;
import java.util.Objects;

public class Driver {
    private int id;
    private String name;
    private Gender gender;
    private Date licenseExpirationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getLicenseExpirationDate() {
        return licenseExpirationDate;
    }

    public void setLicenseExpirationDate(Date licenseExpirationDate) {
        this.licenseExpirationDate = licenseExpirationDate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Driver driver = (Driver) object;
        return id == driver.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Driver. " +
                "id: " + id +
                "; name: " + name +
                "; gender: " + gender +
                "; licenseExpirationDate: " + licenseExpirationDate;
    }
}
