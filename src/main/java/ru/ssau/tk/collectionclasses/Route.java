package ru.ssau.tk.collectionclasses;

import java.util.*;

public class Route implements Iterable<Location> {

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

    public Location getFirstLocation() {
        return locations.get(0);
    }

    public Location getLastLocation() {
        return locations.get(locations.size() - 1);
    }

    @Override
    public Iterator<Location> iterator() {
        return new Iterator<>() {
            private Location location = getFirstLocation();
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < getLocations().size();
            }

            @Override
            public Location next() {
                if (hasNext()) {
                    location = locations.get(count++);
                    return location;
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }

    public void removeLocation(Location location) {
        int flag = 0;
        for (Location currentLocation : this.locations) {
            if (currentLocation.equals(location)) {
                removeLocation(flag);
                return;
            }
            flag++;
        }
    }
}
