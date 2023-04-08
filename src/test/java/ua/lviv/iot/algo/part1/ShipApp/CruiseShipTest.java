package ua.lviv.iot.algo.part1.ShipApp;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CruiseShipTest {
    CruiseShip cruiseShip = new CruiseShip(150,10.2,"CruiseShip 1",
            "Cristiano Ronaldo","Hong Kong",21.6, 76.5,
            76.5, 16.7,60,30);

    CruiseShip cruiseShip1 = new CruiseShip(200,10.6,"CruiseShip 2",
            "Mr Beast","Singapore",24.0,100,80,
            23.0,45,36);


    @Test
    public void testConstructor(){
        Assertions.assertEquals(150,cruiseShip.getPassengersCount());
        Assertions.assertEquals(10.2,cruiseShip.getId());
        Assertions.assertEquals("CruiseShip 1",cruiseShip.getName());
        Assertions.assertEquals("Cristiano Ronaldo",cruiseShip.getCaptain());
        Assertions.assertEquals("Hong Kong",cruiseShip.getCurrentPort());
        Assertions.assertEquals(21.6,cruiseShip.getMaxSpeed());
        Assertions.assertEquals(76.5,cruiseShip.getMaxCapacity());
        Assertions.assertEquals(76.5,cruiseShip.getCurrentLoad());
        Assertions.assertEquals(16.7,cruiseShip.getCurrentSpeed());
        Assertions.assertEquals(60,cruiseShip.getCrewCount());
        Assertions.assertEquals(30,cruiseShip.getSupportStaff());
    }

    @Test
    public void testConstructor1(){
        Assertions.assertEquals(200,cruiseShip1.getPassengersCount());
        Assertions.assertEquals(10.6,cruiseShip1.getId());
        Assertions.assertEquals("CruiseShip 2",cruiseShip1.getName());
        Assertions.assertEquals("Mr Beast",cruiseShip1.getCaptain());
        Assertions.assertEquals("Singapore",cruiseShip1.getCurrentPort());
        Assertions.assertEquals(24.0,cruiseShip1.getMaxSpeed());
        Assertions.assertEquals(100,cruiseShip1.getMaxCapacity());
        Assertions.assertEquals(80,cruiseShip1.getCurrentLoad());
        Assertions.assertEquals(23.0,cruiseShip1.getCurrentSpeed());
        Assertions.assertEquals(45,cruiseShip1.getCrewCount());
        Assertions.assertEquals(36,cruiseShip1.getSupportStaff());
    }


    @Test
    public void  getTotalPeopleCountTest(){
        Assertions.assertEquals(240,cruiseShip.getTotalPeopleCount());
    }

    @Test
    public void calculateLoadTimeTest(){
        Assertions.assertEquals(750,cruiseShip.calculateLoadTime());
    }

    @Test
    public void  getTotalPeopleCountTest1(){
        Assertions.assertEquals(281,cruiseShip1.getTotalPeopleCount());
    }

    @Test
    public void calculateLoadTimeTest1(){
        Assertions.assertEquals(1000,cruiseShip1.calculateLoadTime());
    }

    @Test
    public void toStringTest() {
        Assertions.assertEquals("CruiseShip(passengersCount=150) Ship(id=10.2, name=CruiseShip 1," +
                " captain=Cristiano Ronaldo, currentPort=Hong Kong, maxSpeed=21.6, maxCapacity=76.5, currentLoad=76.5," +
                " currentSpeed=16.7, crewCount=60, supportStaff=30)",cruiseShip.toString());
    }
}
