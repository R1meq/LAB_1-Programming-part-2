package ua.lviv.iot.algo.part1.ShipApp;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoroShip extends CargoShip {
    private int vehicles;

    RoroShip(final int vehicles, final double tonnage,
             final String typeOfCargo, final double id,
             final String name, final String captain,
             final String currentPort, final double maxSpeed,
             final double maxCapacity, final double currentLoad,
             final double currentSpeed, final int crewCount,
             final int supportStaff) {
        super(tonnage, typeOfCargo, id, name, captain, currentPort,
                maxSpeed, maxCapacity, currentLoad, currentSpeed,
                crewCount, supportStaff);
        this.vehicles = vehicles;
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
        return "ROROShip("
                +
                "vehicles=" + vehicles
                +
                ") " + super.toString();
    }
}
