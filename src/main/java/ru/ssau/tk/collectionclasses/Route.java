package ru.ssau.tk.collectionclasses;

import java.util.*;

public class Route {

    private List<Location> locations;

    public Route() {
        this.locations = new ArrayList<>(Collections.emptyList());
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void addLocation(Location location) {
        this.locations.add(location);
    }

    public void addLocation(int index, Location location) {
        this.locations.add(index, location);
    }

    public void removeLocation(int index) {
        this.locations.remove(index);
    }
}
