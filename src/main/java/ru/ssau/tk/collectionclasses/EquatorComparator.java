package ru.ssau.tk.collectionclasses;

import java.util.Comparator;

public class EquatorComparator implements Comparator<Location> {
    @Override
    public int compare(Location location1, Location location2) {
        return Double.compare(Math.abs(location1.getLatitude()), Math.abs(location2.getLatitude()));
    }
}
