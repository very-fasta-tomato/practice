package ru.ssau.tk.collectionclasses;

import java.util.*;
import java.lang.Math;

public final class Route implements Iterable<Location> {

    private final List<Location> locations;

    public Route() {
        this.locations = new ArrayList<>();
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Route route = (Route) object;
        List<Location> objectLocations = route.getLocations();
        if (objectLocations.size() != this.locations.size()) return false;
        for (int i = 0; i < locations.size(); i++) {
            if (!(objectLocations.get(i).equals(locations.get(i)))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(locations);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Location location : locations) {
            if (location.getClass() == Settlement.class) {
                Settlement settlement = (Settlement) location;
                stringBuilder.append(settlement.toString());
            }
            if (location.getClass() == Waypoint.class) {
                Waypoint waypoint = (Waypoint) location;
                stringBuilder.append(waypoint.toString());
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public double length() {
        double length = 0;
        for (int i = 1; i < locations.size(); i++) {
            double x1 = locations.get(i - 1).getLatitude();
            double y1 = locations.get(i - 1).getLongitude();
            double x2 = locations.get(i).getLatitude();
            double y2 = locations.get(i).getLongitude();
            length += Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
        return length;
    }
}
