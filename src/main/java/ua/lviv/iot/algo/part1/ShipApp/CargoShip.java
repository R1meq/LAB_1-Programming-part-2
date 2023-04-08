package ua.lviv.iot.algo.part1.ShipApp;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public  abstract class CargoShip extends Ship {
    public static final int MINUTES_IN_HOUR = 60;
    public static final int AVERAGE_LOAD_TIME = 20;
    public double tonnage;
    protected String typeOfCargo;

    CargoShip(double tonnage,String typeOfCargo,double id,
              String name, String captain, String currentPort,
              double maxSpeed,double maxCapacity, double currentLoad,
              double currentSpeed,int crewCount,int supportStaff)
    {
        super(id, name, captain, currentPort, maxSpeed, maxCapacity,
                currentLoad, currentSpeed, crewCount, supportStaff);
        this.tonnage = tonnage;
        this.typeOfCargo = typeOfCargo;
    }
    @Override
    public String toString() {
        return "CargoShip(" +
                "tonnage=" + tonnage +
                "typeOfCargo=" + typeOfCargo +
                ") " + super.toString();
    }
}