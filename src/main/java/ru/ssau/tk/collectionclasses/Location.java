package ru.ssau.tk.collectionclasses;

import java.util.Objects;

public class Location implements Comparable<Location> {
    private int id;
    private String name;
    private double latitude;
    private double longitude;
    private EquatorComparator equatorComparator = new EquatorComparator();

    public Location() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Location location = (Location) object;
        return id == location.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Location location) {
        return equatorComparator.compare(this, location);
    }
}
