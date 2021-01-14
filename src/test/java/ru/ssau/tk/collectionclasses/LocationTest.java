package ru.ssau.tk.collectionclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LocationTest {

    Settlement villageOne = new Settlement();
    Settlement villageTwo = new Settlement();
    Settlement villageThree = new Settlement();
    Settlement city = new Settlement();
    Waypoint depot = new Waypoint();
    Waypoint warehouse = new Waypoint();

    @Test
    public void testEquals() {
        villageOne.setId(1);
        villageTwo.setId(1);
        villageThree.setId(2);
        city.setId(1);
        depot.setId(1);
        villageOne.setType(SettlementType.VILLAGE);
        villageTwo.setType(SettlementType.VILLAGE);
        villageThree.setType(SettlementType.VILLAGE);
        city.setType(SettlementType.CITY);
        depot.setType(WaypointType.DEPOT);
        villageOne.setName("One");
        villageTwo.setName("Two");
        assertTrue(villageOne.equals(villageTwo));
        assertTrue(villageTwo.equals(villageTwo));
        assertTrue(villageTwo.equals(villageOne));
        assertTrue(villageOne.equals(city));
        assertTrue(villageTwo.equals(city));
        assertFalse(villageOne.equals(depot));
        assertFalse(villageOne.equals(villageThree));
        city.setId(3);
        assertFalse(villageOne.equals(city));
        assertFalse(city.equals(null));
    }

    @Test
    public void testToString() {
        villageOne.setType(SettlementType.VILLAGE);
        city.setType(SettlementType.CITY);
        depot.setType(WaypointType.DEPOT);
        warehouse.setType(WaypointType.WAREHOUSE);
        villageOne.setName("village");
        city.setName("city");
        depot.setName("depot");
        warehouse.setName("warehouse");
        villageOne.setLatitude(54.3);
        city.setLatitude(54.6);
        depot.setLatitude(54.1);
        warehouse.setLatitude(54.2);
        villageOne.setLongitude(44.2);
        city.setLongitude(45.7);
        depot.setLongitude(45.6);
        warehouse.setLongitude(46.2);
        assertEquals(villageOne.toString(), "Settlement. Type: VILLAGE; name: village; latitude: 54.3; longitude: 44.2");
        assertEquals(city.toString(), "Settlement. Type: CITY; name: city; latitude: 54.6; longitude: 45.7");
        assertEquals(depot.toString(), "Waypoint. Type: DEPOT; name: depot; latitude: 54.1; longitude: 45.6");
        assertEquals(warehouse.toString(), "Waypoint. Type: WAREHOUSE; name: warehouse; latitude: 54.2; longitude: 46.2");
    }
}