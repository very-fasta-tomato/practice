package ru.ssau.tk.collectionclasses;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.testng.Assert.*;

public class RouteTest {

    Location village = new Settlement();
    Location city = new Settlement();
    Location depot = new Waypoint();
    Location warehouse = new Waypoint();
    Route testRoute;

    private void fillRoute() {
        testRoute.addLocation(village);
        testRoute.addLocation(city);
    }

    @Test
    public void testGetLocations() {
        testRoute = new Route();
        assertEquals(testRoute.getLocations(), Collections.EMPTY_LIST);
        fillRoute();
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village, city)));
    }

    @Test
    public void testAddLocation() {
        testRoute = new Route();
        fillRoute();
        testRoute.addLocation(depot);
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village, city, depot)));
        testRoute.addLocation(1, warehouse);
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village, warehouse, city, depot)));
    }

    @Test
    public void testRemoveLocation() {
        testRoute = new Route();
        fillRoute();
        testRoute.removeLocation(1);
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village)));
    }
}