package ua.lviv.iot.algo.part1.ShipApp;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TunkerShip extends CargoShip{
    private double volumeInBarrels;

    TunkerShip(double tonnage, String typeOfCargo, double id, String name,
               String captain, String currentPort, double maxSpeed,
               double maxCapacity, double currentLoad, double currentSpeed,
               int crewCount, int supportStaff,double volumeInBarrels)
    {
        super(tonnage, typeOfCargo, id, name, captain, currentPort,
                maxSpeed, maxCapacity, currentLoad, currentSpeed,
                crewCount, supportStaff);
        this.volumeInBarrels = volumeInBarrels;
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
        return  "TunkerShip(" +
                "volumeinBarrels = " + volumeInBarrels +
                ") " + super.toString();
    }
}