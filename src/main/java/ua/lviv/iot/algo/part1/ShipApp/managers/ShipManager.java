package ua.lviv.iot.algo.part1.ShipApp.managers;

import ua.lviv.iot.algo.part1.ShipApp.models.Ship;

import java.util.ArrayList;
import java.util.List;


public class ShipManager extends AbstractShipManager {
    private final List<Ship> ships = new ArrayList<>();

    @Override
    public void addShip(final Ship ship) {
        ships.add(ship);
    }

    @Override
    public List<Ship> findAllWithMoreThanLoad(final double currentLoad) {
        return ships.stream().filter(
                (n) -> (n.getCurrentLoad()) > currentLoad).toList();
    }

    @Override
    public List<Ship> findAllWithMoreThanCapacity(final double maxCapacity) {
        return ships.stream().filter(
                (n) -> (n.getMaxCapacity()) > maxCapacity).toList();
    }
}