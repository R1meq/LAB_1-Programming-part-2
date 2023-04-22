package ua.lviv.iot.algo.part1.ShipApp.managers;

import ua.lviv.iot.algo.part1.ShipApp.models.Ship;

import java.util.List;

public abstract class AbstractShipManager {
    public abstract void addShip(Ship ship);

    public abstract List<Ship> findAllWithMoreThanCapacity(double maxCapacity);

    public abstract List<Ship> findAllWithMoreThanLoad(double currentLoad);
}
