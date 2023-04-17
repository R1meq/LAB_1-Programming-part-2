package ua.lviv.iot.algo.part1.ShipApp;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public  abstract class CargoShip extends Ship {
    public static final int MINUTES_IN_HOUR = 60;
    public static final int AVERAGE_LOAD_TIME = 20;
    private double tonnage;
    private String typeOfCargo;

    CargoShip(final double tonnage, final String typeOfCargo,
              final double id, final String name, final String captain,
              final String currentPort, final double maxSpeed,
              final double maxCapacity, final double currentLoad,
              final double currentSpeed, final int crewCount,
              final int supportStaff) {
        super(id, name, captain, currentPort, maxSpeed, maxCapacity,
                currentLoad, currentSpeed, crewCount, supportStaff);
        this.tonnage = tonnage;
        this.typeOfCargo = typeOfCargo;
    }
    @Override
    public String toString() {
        return "CargoShip("
                +
                "tonnage=" + tonnage
                +
                "typeOfCargo=" + typeOfCargo
                +
                ") " + super.toString();
    }
}
