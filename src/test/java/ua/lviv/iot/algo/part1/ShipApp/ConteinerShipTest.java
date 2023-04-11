package ua.lviv.iot.algo.part1.ShipApp;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ConteinerShipTest {
   ContainerShip containerShip = new ContainerShip(2,2,"raw materials",
           15.6,"ContainerShip 1", "Rob Bourdon","Lviv",19.5,
           125,102, 18.5,20,35);

   ContainerShip containerShip1 = new ContainerShip(2,2,"foodstuffs",18.7,
           "ContainerShip 2", "Tom Cruise","Shanghai",17.7,110.5,
           65, 15.6,27,45);

   @Test
   public void testConstructor(){
       Assertions.assertEquals(2,containerShip.getContainers());
       Assertions.assertEquals(2,containerShip.getTonnage());
       Assertions.assertEquals("raw materials",containerShip.getTypeOfCargo());
       Assertions.assertEquals(15.6,containerShip.getId());
       Assertions.assertEquals("ContainerShip 1",containerShip.getName());
       Assertions.assertEquals("Rob Bourdon",containerShip.getCaptain());
       Assertions.assertEquals("Lviv",containerShip.getCurrentPort());
       Assertions.assertEquals(19.5,containerShip.getMaxSpeed());
       Assertions.assertEquals(125,containerShip.getMaxCapacity());
       Assertions.assertEquals(102,containerShip.getCurrentLoad());
       Assertions.assertEquals(18.5,containerShip.getCurrentSpeed());
       Assertions.assertEquals(20,containerShip.getCrewCount());
       Assertions.assertEquals(35,containerShip.getSupportStaff());
    }

    @Test
    public void testConstructor1(){
        Assertions.assertEquals(2,containerShip1.getContainers());
        Assertions.assertEquals(2,containerShip1.getTonnage());
        Assertions.assertEquals("foodstuffs",containerShip1.getTypeOfCargo());
        Assertions.assertEquals(18.7,containerShip1.getId());
        Assertions.assertEquals("ContainerShip 2",containerShip1.getName());
        Assertions.assertEquals("Tom Cruise",containerShip1.getCaptain());
        Assertions.assertEquals("Shanghai",containerShip1.getCurrentPort());
        Assertions.assertEquals(17.7,containerShip1.getMaxSpeed());
        Assertions.assertEquals(110.5,containerShip1.getMaxCapacity());
        Assertions.assertEquals(65,containerShip1.getCurrentLoad());
        Assertions.assertEquals(15.6,containerShip1.getCurrentSpeed());
        Assertions.assertEquals(27,containerShip1.getCrewCount());
        Assertions.assertEquals(45,containerShip1.getSupportStaff());
    }


    @Test
    public void getTotalPeopleCountTest(){
       Assertions.assertEquals(55,containerShip.getTotalPeopleCount());
    }

    @Test
    public void calculateLoadTimeTest(){
       Assertions.assertEquals(6,containerShip.calculateLoadTime());
    }

    @Test
    public void getTotalPeopleCountTest1(){
        Assertions.assertEquals(72,containerShip1.getTotalPeopleCount());
    }

    @Test
    public void calculateLoadTimeTest1(){
        Assertions.assertEquals(6,containerShip1.calculateLoadTime());
    }

    @Test
    public void toStringTest(){
       Assertions.assertEquals("ContainerShip(containers=2) CargoShip" +
               "(tonnage=2.0typeOfCargo=raw materials)" +
               " Ship(id=15.6, name=ContainerShip 1, captain=Rob Bourdon, " +
               "currentPort=Lviv, maxSpeed=19.5," +
               " maxCapacity=125.0, currentLoad=102.0, currentSpeed=18.5," +
               " crewCount=20," +
               " supportStaff=35)",containerShip.toString());
    }
}
