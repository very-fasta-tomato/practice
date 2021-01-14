package ru.ssau.tk.collectionclasses;

import java.util.*;

public class Route {

    private ArrayList<Location> locations = new ArrayList<>();


    public List<Location> getLocations() {
        return locations;
    }

    public void addLocation(Location location) {
        this.locations.add(location);
    }

    public void addLocation(int index, Location location) {
        locations.add(index, location);
    }

    public void removeLocation(int index) {
        this.locations.remove(index);
    }
}
