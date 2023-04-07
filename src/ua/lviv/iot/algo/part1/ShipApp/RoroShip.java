package ua.lviv.iot.algo.part1.ShipApp;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoroShip extends CargoShip{
    private int vehicles;

    RoroShip(int vehicles, double tonnage, String typeOfCargo, double id,
             String name, String captain, String currentPort, double maxSpeed,
             double maxCapacity, double currentLoad, double currentSpeed,
             int crewCount, int supportStaff)
    {
        super(tonnage, typeOfCargo, id, name, captain, currentPort,
                maxSpeed, maxCapacity, currentLoad, currentSpeed,
                crewCount, supportStaff);
        this.vehicles = vehicles;
    }

    @Override
    public int getTotalPeopleCount() {
        return crewCount + supportStaff;
    }

    @Override
    public double calculateLoadTime() {
        return MINUTES_IN_HOUR * tonnage/AVERAGE_LOAD_TIME;
    }

    @Override
    public String toString() {
        return "ROROShip(" +
                "vehicles=" + vehicles +
                ") " + super.toString();
    }
}