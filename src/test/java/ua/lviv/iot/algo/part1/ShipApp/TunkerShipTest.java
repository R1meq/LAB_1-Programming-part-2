package ua.lviv.iot.algo.part1.ShipApp;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TunkerShipTest {
    TunkerShip tunkerShip = new TunkerShip(10.6,"gasoline",20.4,"TunkerShip 1",
            "Mike Shinoda","Odessa",13.5,50.2,40.2,
            11.5,15,28,44.5);

    TunkerShip tunkerShip1 = new TunkerShip(16.5,"crude oil",10.5,"TunkerShip 2",
            "Joe Hahn","Lisbon",15,60.2,20.6,
            13.6,20,36,65.7);

    @Test
    public void testConstructor(){
        Assertions.assertEquals(10.6,tunkerShip.getTonnage());
        Assertions.assertEquals("gasoline",tunkerShip.getTypeOfCargo());
        Assertions.assertEquals(20.4,tunkerShip.getId());
        Assertions.assertEquals("TunkerShip 1",tunkerShip.getName());
        Assertions.assertEquals("Mike Shinoda",tunkerShip.getCaptain());
        Assertions.assertEquals("Odessa",tunkerShip.getCurrentPort());
        Assertions.assertEquals(13.5,tunkerShip.getMaxSpeed());
        Assertions.assertEquals(50.2,tunkerShip.getMaxCapacity());
        Assertions.assertEquals(40.2,tunkerShip.getCurrentLoad());
        Assertions.assertEquals(11.5,tunkerShip.getCurrentSpeed());
        Assertions.assertEquals(15,tunkerShip.getCrewCount());
        Assertions.assertEquals(28,tunkerShip.getSupportStaff());
        Assertions.assertEquals(44.5,tunkerShip.getVolumeInBarrels());
    }

    @Test
    public void testConstructor1(){
        Assertions.assertEquals(16.5,tunkerShip1.getTonnage());
        Assertions.assertEquals("crude oil",tunkerShip1.getTypeOfCargo());
        Assertions.assertEquals(10.5,tunkerShip1.getId());
        Assertions.assertEquals("TunkerShip 2",tunkerShip1.getName());
        Assertions.assertEquals("Joe Hahn",tunkerShip1.getCaptain());
        Assertions.assertEquals("Lisbon",tunkerShip1.getCurrentPort());
        Assertions.assertEquals(15,tunkerShip1.getMaxSpeed());
        Assertions.assertEquals(60.2,tunkerShip1.getMaxCapacity());
        Assertions.assertEquals(20.6,tunkerShip1.getCurrentLoad());
        Assertions.assertEquals(13.6,tunkerShip1.getCurrentSpeed());
        Assertions.assertEquals(20,tunkerShip1.getCrewCount());
        Assertions.assertEquals(36,tunkerShip1.getSupportStaff());
        Assertions.assertEquals(65.7,tunkerShip1.getVolumeInBarrels());
    }

    @Test
    public void getTotalPeopleCountTest(){
        Assertions.assertEquals(43,tunkerShip.getTotalPeopleCount());
    }

    @Test
    public void calculateLoadTimeTest(){
        Assertions.assertEquals(31.8,tunkerShip.calculateLoadTime());
    }

    @Test
    public void getTotalPeopleCountTest1(){
        Assertions.assertEquals(56,tunkerShip1.getTotalPeopleCount());
    }

    @Test
    public void calculateLoadTimeTest1(){
        Assertions.assertEquals(49.5,tunkerShip1.calculateLoadTime());
    }
}
