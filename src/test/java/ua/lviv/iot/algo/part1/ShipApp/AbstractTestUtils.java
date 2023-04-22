package ua.lviv.iot.algo.part1.ShipApp;

import ua.lviv.iot.algo.part1.ShipApp.models.*;

import java.util.ArrayList;
import java.util.List;

public class AbstractTestUtils {

    public static List<Ship> prepareListOfShips() {
        List<Ship> ships = new ArrayList<>();

        ships.add(new TunkerShip(10.6, "gasoline", 20.4, "TunkerShip 1",
                "Mike Shinoda", "Odessa", 13.5, 50.2, 40.2,
                11.5, 15, 28, 44.5));

        ships.add(new TunkerShip(16.9, "crude oil", 10.5, "TunkerShip 2",
                "Joe Hahn", "Lisbon", 15, 60.2, 20.6,
                13.6, 20, 36, 65.7));

        ships.add(new RoroShip(15, 12.7, "cars", 11.6, "ROROShip 1",
                " Brad Delson", "LA", 18.6, 15.6, 12.5,
                16.6, 17, 21));

        ships.add(new RoroShip(23, 15.2, "trucks", 12.7, "ROROShip 2",
                " Dave Farrell", "Boston", 22, 25.6, 23.6,
                21, 18, 22));
        ships.add(new ContainerShip(2, 2, "raw materials", 15.6, "ContainerShip 1",
                "Rob Bourdon", "Lviv", 19.5, 125, 102,
                18.5, 20, 35));

        ships.add(new ContainerShip(2, 2, "foodstuffs", 18.7, "ContainerShip 2",
                "Tom Cruise", "Shanghai", 17.7, 110.5, 65,
                15.6, 27, 45));

        ships.add(new CruiseShip(150, 10.2, "CruiseShip 1",
                "Cristiano Ronaldo", "Hong Kong", 21.6, 76.5, 76.5,
                16.7, 60, 30));

        ships.add(new CruiseShip(200, 10.6, "CruiseShip 2",
                "Mr Beast", "Singapore", 24.0, 100, 80,
                23.0, 45, 36));
        return ships;
    }
}
