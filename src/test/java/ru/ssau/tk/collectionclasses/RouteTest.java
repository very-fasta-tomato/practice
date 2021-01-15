package ru.ssau.tk.collectionclasses;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.testng.Assert.*;

public class RouteTest {

    Settlement village = new Settlement();
    Settlement city = new Settlement();
    Waypoint depot = new Waypoint();
    Waypoint warehouse = new Waypoint();
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
        city.setId(1);
        depot.setId(1);
        warehouse.setId(2);
        Location newCity = new Settlement();
        newCity.setId(1);
        testRoute.addLocation(city);
        testRoute.addLocation(depot);
        testRoute.addLocation(warehouse);
        testRoute.addLocation(newCity);
        testRoute.removeLocation(newCity);
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village, depot, warehouse, newCity)));
        testRoute.removeLocation(warehouse);
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village, depot, newCity)));
        testRoute.removeLocation(warehouse);
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village, depot, newCity)));
    }

    @Test
    public void testGetFirstLocation() {
        testRoute = new Route();
        fillRoute();
        assertEquals(testRoute.getFirstLocation(), village);
        testRoute.addLocation(0, depot);
        assertEquals(testRoute.getFirstLocation(), depot);
    }

    @Test
    public void testGetLastLocation() {
        testRoute = new Route();
        fillRoute();
        assertEquals(testRoute.getLastLocation(), city);
        testRoute.addLocation(depot);
        assertEquals(testRoute.getLastLocation(), depot);
    }

    @Test
    public void testIterator() {
        testRoute = new Route();
        village.setId(0);
        city.setId(1);
        depot.setId(2);
        warehouse.setId(3);
        testRoute.addLocation(village);
        testRoute.addLocation(city);
        testRoute.addLocation(depot);
        testRoute.addLocation(warehouse);
        int count = 0;
        for (Location location : testRoute) {
            assertEquals(location.getId(), count);
            count++;
        }
        assertEquals(count, 4);
    }

    @Test
    public void testEquals() {
        testRoute = new Route();
        Route equalRoute = new Route();
        Route notEqualRoute = new Route();
        Location village1 = new Settlement();
        Location village2 = new Settlement();
        Location newVillage1 = new Settlement();
        Location depot = new Waypoint();
        Location warehouse = new Waypoint();
        Location depotInVillage = new Waypoint();
        village1.setId(1);
        village2.setId(2);
        newVillage1.setId(1);
        depot.setId(3);
        warehouse.setId(4);
        depotInVillage.setId(1);

        testRoute.addLocation(village1);
        testRoute.addLocation(village2);
        testRoute.addLocation(depot);
        testRoute.addLocation(warehouse);

        equalRoute.addLocation(newVillage1);
        equalRoute.addLocation(village2);
        equalRoute.addLocation(depot);
        equalRoute.addLocation(warehouse);

        notEqualRoute.addLocation(village1);
        notEqualRoute.addLocation(village1);
        notEqualRoute.addLocation(depot);
        notEqualRoute.addLocation(warehouse);

        assertTrue(testRoute.equals(equalRoute));
        assertFalse(testRoute.equals(notEqualRoute));

        equalRoute.removeLocation(warehouse);
        assertFalse(testRoute.equals(equalRoute));

        equalRoute.addLocation(warehouse);
        equalRoute.removeLocation(0);
        equalRoute.addLocation(0, depotInVillage);
        assertFalse(testRoute.equals(equalRoute));
    }

    @Test
    public void testToString() {
        testRoute = new Route();
        village.setType(SettlementType.VILLAGE);
        city.setType(SettlementType.CITY);
        depot.setType(WaypointType.DEPOT);
        warehouse.setType(WaypointType.WAREHOUSE);
        village.setName("village");
        city.setName("city");
        depot.setName("depot");
        warehouse.setName("warehouse");
        village.setLatitude(54.3);
        city.setLatitude(54.6);
        depot.setLatitude(54.1);
        warehouse.setLatitude(54.2);
        village.setLongitude(44.2);
        city.setLongitude(45.7);
        depot.setLongitude(45.6);
        warehouse.setLongitude(46.2);
        testRoute.addLocation(village);
        testRoute.addLocation(city);
        testRoute.addLocation(warehouse);
        testRoute.addLocation(depot);
        assertEquals(testRoute.toString(),
                "Settlement. Type: VILLAGE; name: village; latitude: 54.3; longitude: 44.2\n" +
                        "Settlement. Type: CITY; name: city; latitude: 54.6; longitude: 45.7\n" +
                        "Waypoint. Type: WAREHOUSE; name: warehouse; latitude: 54.2; longitude: 46.2\n" +
                        "Waypoint. Type: DEPOT; name: depot; latitude: 54.1; longitude: 45.6\n");
    }

    @Test
    public void testLength() {
        testRoute = new Route();
        village.setLatitude(55.4);
        city.setLatitude(60.8);
        depot.setLatitude(75.2);
        warehouse.setLatitude(96.4);
        village.setLongitude(10.5);
        city.setLongitude(40.7);
        depot.setLongitude(12.6);
        warehouse.setLongitude(6.9);
        testRoute.addLocation(city);
        testRoute.addLocation(village);
        testRoute.addLocation(depot);
        testRoute.addLocation(warehouse);
        assertEquals(testRoute.length(), 72.5, 0.1);
        testRoute.addLocation(city);
        testRoute.removeLocation(2);
        assertEquals(testRoute.length(), 120.9, 0.1);
    }
}