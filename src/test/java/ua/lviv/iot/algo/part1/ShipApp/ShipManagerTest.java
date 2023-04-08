package ua.lviv.iot.algo.part1.ShipApp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class ShipManagerTest {
    private ShipManager manager;

    @Before
    public  void setUp(){
        manager = new ShipManager();
        List<Ship> ships = new ArrayList<>();

        manager.addShip(new TunkerShip(10.6,"gasoline",20.4,"TunkerShip 1",
                "Mike Shinoda","Odessa",13.5,50.2,40.2,
                11.5,15,28,44.5));

        manager.addShip(new TunkerShip(16.9,"crude oil",10.5,"TunkerShip 2",
                "Joe Hahn","Lisbon",15,60.2,20.6,
                13.6,20,36,65.7));

        manager.addShip(new RoroShip(15,12.7,"cars",11.6,"ROROShip 1",
                " Brad Delson","LA",18.6,15.6,12.5,
                16.6,17,21));

        manager.addShip(new RoroShip(23,15.2,"trucks",12.7,"ROROShip 2",
                " Dave Farrell","Boston",22,25.6,23.6,
                21,18,22));

        manager.addShip(new ContainerShip(2,2,"raw materials",15.6,"ContainerShip 1",
                "Rob Bourdon","Lviv",19.5,125,102,
                18.5,20,35));

        manager.addShip(new ContainerShip(2,2,"foodstuffs",18.7,"ContainerShip 2",
                "Tom Cruise","Shanghai",17.7,110.5,65,
                15.6,27,45));

        manager.addShip(new CruiseShip(150,10.2,"CruiseShip 1",
                "Cristiano Ronaldo","Hong Kong",21.6,76.5,76.5,
                16.7,60,30));

        manager.addShip(new CruiseShip(200,10.6,"CruiseShip 2",
                "Mr Beast","Singapore",24.0,100,80,
                23.0,45,36));

        for(Ship ship : ships){
            manager.addShip(ship);
        }
    }

    @Test
    public void testFindMoreThanLoad(){
        List<Ship> shipWithLoadGreaterThan = manager.findAllWithMoreThanLoad(50);
        assertEquals(4,shipWithLoadGreaterThan.size());
    }

    @Test
    public void testFindMoreThanCapacity(){
        List<Ship> shipWithCapacityGreaterThan= manager.findAllWithMoreThanCapacity(65);
        assertEquals(4,shipWithCapacityGreaterThan.size());
    }
}
