package ua.lviv.iot.algo.part1.ShipApp;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CruiseShip extends Ship {
    private int passengersCount;

    CruiseShip(int passengersCount,double id,String name, String captain,
               String currentPort,double maxSpeed,
               double maxCapacity, double currentLoad,
               double currentSpeed, int crewCount,int supportStaff)
    {
        super(id, name, captain, currentPort, maxSpeed, maxCapacity,
                currentLoad, currentSpeed, crewCount, supportStaff);
        this.passengersCount = passengersCount;
    }


    @Override
    public int getTotalPeopleCount() {
        return passengersCount + crewCount + supportStaff;
    }

    @Override
    public double calculateLoadTime() {
        return passengersCount * 5;
    }

    @Override
    public String toString() {
        return "CruiseShip(" +
                "passengersCount=" + passengersCount +
                ") "  + super.toString();
    }
}