package ua.lviv.iot.algo.part1.ShipApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Ship {
    public static String HEADERS = "id, name, captain, currentPort, maxSpeed, " +
            "maxCapacity, currentLoad, currentSpeed, crewCount, supportStuff";
    public static final double DEFAULT_VALUE = 10.4;
    private double id = DEFAULT_VALUE;
    private String name;
    private String captain;
    private String currentPort;
    private double maxSpeed;
    private double maxCapacity;
    private double currentLoad;
    private double currentSpeed;
    private int crewCount;
    private int supportStaff;
    public abstract int getTotalPeopleCount();
    public abstract double calculateLoadTime();

    public String getHeaders(){
        return HEADERS;
    }

    public String toCSV(){
        return id + ", " + name + ", " + captain + ", " + currentPort+ ", " + maxSpeed + ", " +
        maxCapacity + ", " + currentLoad+ ", " + currentSpeed + ", " +crewCount+ ", " + supportStaff;
    }
}
