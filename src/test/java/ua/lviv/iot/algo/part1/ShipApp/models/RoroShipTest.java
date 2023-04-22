package ua.lviv.iot.algo.part1.ShipApp.models;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ua.lviv.iot.algo.part1.ShipApp.models.RoroShip;

public class RoroShipTest {
    RoroShip roroShip = new RoroShip(15, 12.7, "cars", 11.6, "ROROShip 1",
            " Brad Delson", "LA", 18.6, 15.6, 12.5, 16.6,
            17, 21);

    RoroShip roroShip1 = new RoroShip(23, 15.2, "trucks", 12.7, "ROROShip 2",
            " Dave Farrell", "Boston", 22, 25.6, 23.6, 21,
            18, 22);

    @Test
    public void testConstructor() {
        Assertions.assertEquals(15, roroShip.getVehicles());
        Assertions.assertEquals(12.7, roroShip.getTonnage());
        Assertions.assertEquals("cars", roroShip.getTypeOfCargo());
        Assertions.assertEquals(11.6, roroShip.getId());
        Assertions.assertEquals("ROROShip 1", roroShip.getName());
        Assertions.assertEquals(" Brad Delson", roroShip.getCaptain());
        Assertions.assertEquals("LA", roroShip.getCurrentPort());
        Assertions.assertEquals(18.6, roroShip.getMaxSpeed());
        Assertions.assertEquals(15.6, roroShip.getMaxCapacity());
        Assertions.assertEquals(12.5, roroShip.getCurrentLoad());
        Assertions.assertEquals(16.6, roroShip.getCurrentSpeed());
        Assertions.assertEquals(17, roroShip.getCrewCount());
        Assertions.assertEquals(21, roroShip.getSupportStaff());
    }

    @Test
    public void testConstructor1() {
        Assertions.assertEquals(23, roroShip1.getVehicles());
        Assertions.assertEquals(15.2, roroShip1.getTonnage());
        Assertions.assertEquals("trucks", roroShip1.getTypeOfCargo());
        Assertions.assertEquals(12.7, roroShip1.getId());
        Assertions.assertEquals("ROROShip 2", roroShip1.getName());
        Assertions.assertEquals(" Dave Farrell", roroShip1.getCaptain());
        Assertions.assertEquals("Boston", roroShip1.getCurrentPort());
        Assertions.assertEquals(22, roroShip1.getMaxSpeed());
        Assertions.assertEquals(25.6, roroShip1.getMaxCapacity());
        Assertions.assertEquals(23.6, roroShip1.getCurrentLoad());
        Assertions.assertEquals(21, roroShip1.getCurrentSpeed());
        Assertions.assertEquals(18, roroShip1.getCrewCount());
        Assertions.assertEquals(22, roroShip1.getSupportStaff());
    }

    @Test
    public void getTotalPeopleCountTest() {
        Assertions.assertEquals(38, roroShip.getTotalPeopleCount());
    }

    @Test
    public void calculateLoadTimeTest() {
        Assertions.assertEquals(38.1, roroShip.calculateLoadTime());
    }

    @Test
    public void getTotalPeopleCountTest1() {
        Assertions.assertEquals(40, roroShip1.getTotalPeopleCount());
    }

    @Test
    public void calculateLoadTimeTest1() {
        Assertions.assertEquals(45.6, roroShip1.calculateLoadTime());
    }
}
