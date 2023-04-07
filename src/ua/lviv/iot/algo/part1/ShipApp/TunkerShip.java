package ua.lviv.iot.algo.part1.ShipApp;

public class TunkerShip extends CargoShip{

    TunkerShip(double tonnage, String typeOfCargo, double id, String name,
               String captain, String currentPort, double maxSpeed,
               double maxCapacity, double currentLoad, double currentSpeed,
               int crewCount, int supportStaff)
    {
        super(tonnage, typeOfCargo, id, name, captain, currentPort,
                maxSpeed, maxCapacity, currentLoad, currentSpeed,
                crewCount, supportStaff);
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
        return  "TunkerShip(" +
                ")  " + super.toString();
    }
}