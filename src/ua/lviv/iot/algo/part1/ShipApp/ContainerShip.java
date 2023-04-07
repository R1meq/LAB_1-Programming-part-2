package ua.lviv.iot.algo.part1.ShipApp;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContainerShip extends CargoShip{
    private int containers  ;

    ContainerShip(int containers,double tonnage, String typeOfCargo,
                  double id, String name, String captain, String currentPort,
                  double maxSpeed, double maxCapacity, double currentLoad,
                  double currentSpeed, int crewCount, int supportStaff)
    {
        super(tonnage, typeOfCargo, id, name, captain,
                currentPort, maxSpeed, maxCapacity, currentLoad,
                currentSpeed, crewCount, supportStaff);
        this.containers = containers;
    }

    @Override
    public int getTotalPeopleCount() {
        return crewCount + supportStaff;
    }

    @Override
    public double calculateLoadTime() {
        int loadtime = 60;
        double load = tonnage/20;

        return loadtime * load;
    }

    @Override
    public String toString() {
        return  "ContainerShip(" +
                "containers=" + containers +
                ") " + super.toString();
    }
}