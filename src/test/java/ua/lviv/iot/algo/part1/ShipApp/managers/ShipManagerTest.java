package ua.lviv.iot.algo.part1.ShipApp.managers;

import org.junit.Before;
import org.junit.Test;
import ua.lviv.iot.algo.part1.ShipApp.managers.ShipManager;
import ua.lviv.iot.algo.part1.ShipApp.models.*;

import static org.junit.Assert.assertEquals;
import static ua.lviv.iot.algo.part1.ShipApp.AbstractTestUtils.prepareListOfShips;

import java.util.ArrayList;
import java.util.List;

public class ShipManagerTest {
    private ShipManager manager;

    @Before
    public void setUp() {
        manager = new ShipManager();
        for (Ship ship : prepareListOfShips()) {
            manager.addShip(ship);
        }
    }

    @Test
    public void testFindMoreThanLoad() {
        List<Ship> shipWithLoadGreaterThan = manager.findAllWithMoreThanLoad(50);
        assertEquals(4, shipWithLoadGreaterThan.size());
    }

    @Test
    public void testFindMoreThanCapacity() {
        List<Ship> shipWithCapacityGreaterThan = manager.findAllWithMoreThanCapacity(65);
        assertEquals(4, shipWithCapacityGreaterThan.size());
    }
}
