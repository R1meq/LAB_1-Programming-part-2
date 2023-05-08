package ua.lviv.iot.algo.part1.ShipApp.dto;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CruiseShipDto {
    private Integer id;
    private double idOfShip;
    private String name;
    private String captain;
    private String currentPort;
    private double maxSpeed;
    private double maxCapacity;
    private double currentLoad;
    private double currentSpeed;
    private int crewCount;
    private int supportStaff;
    private int passengersCount;
}
