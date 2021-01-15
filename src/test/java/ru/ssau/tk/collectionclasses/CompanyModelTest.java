package ru.ssau.tk.collectionclasses;

import org.testng.annotations.Test;
import ru.ssau.tk.personclasses.Gender;

import java.util.*;

import static org.testng.Assert.*;

public class CompanyModelTest {
    CompanyModel companyModelOne = new CompanyModel();
    CompanyModel companyModelTwo = new CompanyModel();
    Settlement village1 = new Settlement();
    Settlement village2 = new Settlement();
    Settlement city1 = new Settlement();
    Settlement city2 = new Settlement();
    Waypoint village1Warehouse = new Waypoint();
    Waypoint village2Waypoint = new Waypoint();
    Waypoint city1Depot = new Waypoint();
    Waypoint city2Warehouse = new Waypoint();
    Waypoint loneDepot = new Waypoint();
    Driver bob = new Driver();
    Driver alice = new Driver();
    Driver eve = new Driver();
    Driver charlie = new Driver();
    Driver chuck = new Driver();
    Driver carol = new Driver();
    Route route1 = new Route();
    Route route2 = new Route();
    Route route3 = new Route();
    Route route4 = new Route();
    Route route5 = new Route();

    private void fillModels() {
        village1 = companyModelOne.addSettlement("village1", 20.36, 45.12, SettlementType.VILLAGE, 1200);
        village2 = companyModelOne.addSettlement("village2", 20.45, 45.81, SettlementType.VILLAGE, 540);
        city1 = companyModelOne.addSettlement("city1", 20.47, 46.01, SettlementType.CITY, 1250000);
        city2 = companyModelOne.addSettlement("city2", 21.87, 45.84, SettlementType.CITY, 384000);
        village1Warehouse = companyModelOne.addWaypoint("village1.Warehouse", 20.36, 45.12, WaypointType.WAREHOUSE, village1);
        village2Waypoint = companyModelOne.addWaypoint("village2.Waypoint", 20.36, 45.12, WaypointType.EMPTY, village2);
        city1Depot = companyModelOne.addWaypoint("city1.Depot", 20.47, 46.01, WaypointType.DEPOT, city1);
        loneDepot = companyModelOne.addWaypoint("lone Depot", 20.54, 45.85, WaypointType.DEPOT, null);
        city2Warehouse = companyModelOne.addWaypoint("city2.Warehouse", 21.87, 45.84, WaypointType.WAREHOUSE, city2);
        bob = companyModelOne.addDriver("Bob", Gender.MALE, new Date(121, Calendar.APRIL, 21));
        alice = companyModelOne.addDriver("Alice", Gender.FEMALE, new Date(127, Calendar.DECEMBER, 5));
        eve = companyModelOne.addDriver("Eve", Gender.FEMALE, new Date(135, Calendar.AUGUST, 16));
        charlie = companyModelOne.addDriver("Charlie", Gender.MALE, new Date(140, Calendar.JANUARY, 2));
        route1 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, village2Waypoint, village1Warehouse, city2Warehouse, loneDepot)));
        route2 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, city2, city2Warehouse, loneDepot)));
        route3 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(loneDepot, village2, village2Waypoint, village1Warehouse, city1, city1Depot)));
        companyModelOne.assignRoute(bob, route1);
        companyModelOne.assignRoute(alice, route2);
        companyModelOne.assignRoute(charlie, route3);

        companyModelTwo.addSettlement("village1", 20.36, 45.12, SettlementType.VILLAGE, 1200);
        companyModelTwo.addSettlement("village2", 20.45, 45.81, SettlementType.VILLAGE, 540);
        companyModelTwo.addSettlement("city1", 20.47, 46.01, SettlementType.CITY, 1250000);
        companyModelTwo.addSettlement("city2", 21.87, 45.84, SettlementType.CITY, 384000);
        companyModelTwo.addWaypoint("city1.Depot", 20.47, 46.01, WaypointType.DEPOT, city1);
        companyModelTwo.addWaypoint("lone Depot", 20.54, 45.85, WaypointType.DEPOT, null);
        chuck = companyModelTwo.addDriver("Chuck", Gender.MALE, new Date(123, Calendar.MAY, 6));
        carol = companyModelTwo.addDriver("Carol", Gender.FEMALE, new Date(129, Calendar.OCTOBER, 28));
        route4 = companyModelTwo.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, village1, village2, city2, loneDepot)));
        route5 = companyModelTwo.addRoute(new ArrayList<>(Arrays.asList(loneDepot, village1, city2, city1, city1Depot)));
        companyModelTwo.assignRoute(chuck, route4);
        companyModelTwo.assignRoute(carol, route5);
    }

    @Test
    public void testGetAllLocations() {
        fillModels();
        Collection<Location> locationsOne = companyModelOne.getAllLocations();
        Collection<Location> locationsTwo = companyModelTwo.getAllLocations();
        int i = 1;
        for (Location location : locationsOne) {
            if (i == 1) {
                assertEquals(location.toString(), village1.toString());
            }
            if (i == 2) {
                assertEquals(location.toString(), village2.toString());
            }
            if (i == 3) {
                assertEquals(location.toString(), city1.toString());
            }
            if (i == 4) {
                assertEquals(location.toString(), city2.toString());
            }
            if (i == 5) {
                assertEquals(location.toString(), village1Warehouse.toString());
            }
            if (i == 6) {
                assertEquals(location.toString(), village2Waypoint.toString());
            }
            if (i == 7) {
                assertEquals(location.toString(), city1Depot.toString());
            }
            if (i == 8) {
                assertEquals(location.toString(), loneDepot.toString());
            }
            if (i == 9) {
                assertEquals(location.toString(), city2Warehouse.toString());
            }
            i++;
        }


        i = 1;
        for (Location location : locationsTwo) {
            System.out.println(location.toString());
            if (i == 1) {
                assertEquals(location.toString(), village1.toString());
            }
            if (i == 2) {
                assertEquals(location.toString(), village2.toString());
            }
            if (i == 3) {
                assertEquals(location.toString(), city1.toString());
            }
            if (i == 4) {
                assertEquals(location.toString(), city2.toString());
            }
            if (i == 5) {
                assertEquals(location.toString(), city1Depot.toString());
            }
            if (i == 6) {
                assertEquals(location.toString(), loneDepot.toString());
            }
            i++;
        }
    }

    @Test
    public void testGetAllRoutes() {
        fillModels();
        Collection<Route> routesOne = companyModelOne.getAllRoutes();
        Collection<Route> routesTwo = companyModelTwo.getAllRoutes();
        int i = 1;
        for (Route route : routesOne) {
            if (i == 1) {
                assertEquals(route.toString(), route1.toString());
            }
            if (i == 2) {
                assertEquals(route.toString(), route2.toString());
            }
            if (i == 3) {
                assertEquals(route.toString(), route3.toString());
            }
            i++;
        }
        for (Route route : routesTwo) {
            if (i == 4) {
                assertEquals(route.toString(), route4.toString());
            }
            if (i == 5) {
                assertEquals(route.toString(), route5.toString());
            }
            i++;
        }
    }

    @Test
    public void testGetAllDrivers() {
        Collection<Driver> driversOne = companyModelOne.getAllDrivers();
        Collection<Driver> driversTwo = companyModelTwo.getAllDrivers();
        int i = 1;
        for (Driver driver : driversOne) {
            if (i == 1) {
                assertEquals(driver.toString(), bob.toString());
            }
            if (i == 2) {
                assertEquals(driver.toString(), alice.toString());
            }
            if (i == 3) {
                assertEquals(driver.toString(), eve.toString());
            }
            if (i == 4) {
                assertEquals(driver.toString(), charlie.toString());
            }
            i++;
        }
        for (Driver driver : driversTwo) {
            if (i == 5) {
                assertEquals(driver.toString(), chuck.toString());
            }
            if (i == 6) {
                assertEquals(driver.toString(), carol.toString());
            }
            i++;
        }
    }

    @Test
    public void testAssignRoute() {
        fillModels();
        Map<Driver, Route> mapOne = companyModelOne.getDriverRouteMap();
        Map<Driver, Route> mapTwo = companyModelTwo.getDriverRouteMap();
        assertEquals(mapOne.size(), 3);
        assertEquals(mapTwo.size(), 2);
        assertEquals(mapOne.get(bob), route1);
        assertEquals(mapOne.get(alice), route2);
        assertEquals(mapOne.get(charlie), route3);
        assertEquals(mapTwo.get(chuck), route4);
        assertEquals(mapTwo.get(carol), route5);
    }

    @Test
    public void testRouteComparator() {
        fillModels();
        List<Route> routes = new ArrayList<>(Arrays.asList(route1, route2, route3, route4, route5));
        Collections.sort(routes);
        assertEquals(routes, new ArrayList<>(Arrays.asList(route3, route2, route5, route1, route4)));
        assertEquals(Collections.min(routes), route3);
        assertEquals(Collections.max(routes), route4);
    }

    @Test
    public void testLocationComparator() {
        fillModels();
        List<Location> locations = new ArrayList<>(Arrays.asList(village1, village2, city1, city2, village1Warehouse,
                village2Waypoint, city1Depot, city2Warehouse, loneDepot));
        assertEquals(Collections.max(locations), city2);
        assertEquals(Collections.min(locations), village1);
        Collections.sort(locations);
        assertEquals(locations, new ArrayList<>(Arrays.asList(village1, village1Warehouse, village2Waypoint, village2,
                city1, city1Depot, loneDepot, city2, city2Warehouse)));
    }

    @Test
    public void testSort() {
        fillModels();
        List<Settlement> settlements = new ArrayList<>(Arrays.asList(city1, village2, city2, village1));
        CompanyModel.sort(settlements, (o1, o2) -> Integer.compare(o1.getId(), o2.getId()));
        assertEquals(settlements, new ArrayList<>(Arrays.asList(village1, village2, city1, city2)));
        CompanyModel.sort(settlements, (o1, o2) -> Integer.compare(o1.getSettlement(), o2.getSettlement()));
        assertEquals(settlements, new ArrayList<>(Arrays.asList(village2, village1, city2, city1)));
        CompanyModel.sort(settlements, (o1, o2) -> Double.compare(o1.getLatitude(), o2.getLatitude()));
        assertEquals(settlements, new ArrayList<>(Arrays.asList(village1, village2, city1, city2)));
        CompanyModel.sort(settlements, (o1, o2) -> Double.compare(o1.getLongitude(), o2.getLongitude()));
        assertEquals(settlements, new ArrayList<>(Arrays.asList(village1, village2, city2, city1)));
        CompanyModel.sort(settlements, (o1, o2) -> CharSequence.compare(o1.getName(), o2.getName()));
        assertEquals(settlements, new ArrayList<>(Arrays.asList(city1, city2, village1, village2)));
        CompanyModel.sort(settlements, new EquatorComparator());
        assertEquals(settlements, new ArrayList<>(Arrays.asList(village1, village2, city1, city2)));
    }

    @Test
    public void testSortByName() {
        fillModels();
        List<Location> locations = new ArrayList<>(Arrays.asList(loneDepot, village2, village1, city1Depot,
                city2Warehouse, city2, city1, village1Warehouse, village2Waypoint));
        CompanyModel.sortByName(locations);
        assertEquals(locations, new ArrayList<>(Arrays.asList(city1, city1Depot, city2, city2Warehouse,
                loneDepot, village1, village1Warehouse, village2, village2Waypoint)));
        List<Settlement> settlements = new ArrayList<>(Arrays.asList(city1, village2, city2, village1));
        CompanyModel.sortByName(settlements);
        assertEquals(settlements, new ArrayList<>(Arrays.asList(city1, city2, village1, village2)));
    }
}