package ua.lviv.iot.algo.part1.ShipApp;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Ship {
    protected double id = 10.4;
    protected String name;
    protected String captain;
    protected String currentPort;
    protected double maxSpeed;
    protected double maxCapacity;
    protected double currentLoad;
    protected double currentSpeed;
    protected int crewCount;
    protected int supportStaff;
    public abstract int getTotalPeopleCount();
    public abstract double calculateLoadTime();
}