package ua.lviv.iot.algo.part1.ShipApp;
import java.util.ArrayList;
import java.util.List;


public class ShipManager extends AbstractShipManager {
    private final List<Ship> ships = new ArrayList<>();

    @Override
    public void addShip(Ship ship) {
        ships.add(ship);
    }

    @Override
    public List<Ship> findAllWithMoreThanLoad(double currentLoad) {
        return ships.stream().filter(
                (n) -> (n.currentLoad) > currentLoad).toList();
    }

    @Override
    public List<Ship> findAllWithMoreThanCapacity(double maxCapacity) {
        return ships.stream().filter(
                (n) -> (n.maxCapacity) > maxCapacity).toList();
    }
}