package ua.lviv.iot.algo.part1.ShipApp.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TunkerShip extends CargoShip {
    public static final String HEADERS = "volumeInBarrels, ";
    private double volumeInBarrels;

    public TunkerShip(final double tonnage,
                      final String typeOfCargo, final double idOfShip,
                      final String name, final String captain,
                      final String currentPort, final double maxSpeed,
                      final double maxCapacity, final double currentLoad,
                      final double currentSpeed, final int crewCount,
                      final int supportStaff, final double volumeInBarrels) {
        super(tonnage, typeOfCargo, idOfShip, name, captain, currentPort,
                maxSpeed, maxCapacity, currentLoad, currentSpeed,
                crewCount, supportStaff);
        this.volumeInBarrels = volumeInBarrels;
    }

    @Override
    public int getTotalPeopleCount() {
        return getCrewCount() + getSupportStaff();
    }

    @Override
    public double calculateLoadTime() {
        return MINUTES_IN_HOUR * getTonnage() / AVERAGE_LOAD_TIME;
    }

    @Override
    public String toString() {
        return "TunkerShip("
                +
                "volumeinBarrels = " + volumeInBarrels
                +
                ") " + super.toString();
    }

    public String getHeaders() {
        return HEADERS + super.getHeaders();
    }

    public String toCSV() {
        return volumeInBarrels + ", " + super.toCSV();
    }
}