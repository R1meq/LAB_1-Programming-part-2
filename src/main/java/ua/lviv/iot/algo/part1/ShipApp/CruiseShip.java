package ua.lviv.iot.algo.part1.ShipApp;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CruiseShip extends Ship {
    public static final int AVERAGE_LOAD_TIME_FOR_PASSENGER = 5;
    private int passengersCount;

    CruiseShip(final int passengersCount, final double id, final String name,
               final String captain, final String currentPort,
               final double maxSpeed, final double maxCapacity,
               final double currentLoad, final double currentSpeed,
               final int crewCount, final int supportStaff) {
        super(id, name, captain, currentPort, maxSpeed, maxCapacity,
                currentLoad, currentSpeed, crewCount, supportStaff);
        this.passengersCount = passengersCount;
    }

    @Override
    public int getTotalPeopleCount() {
        return passengersCount + getCrewCount() + getSupportStaff();
    }

    @Override
    public double calculateLoadTime() {
        return passengersCount * AVERAGE_LOAD_TIME_FOR_PASSENGER;
    }

    @Override
    public String toString() {
        return "CruiseShip("
                +
                "passengersCount=" + passengersCount
                +
                ") "  + super.toString();
    }
}
