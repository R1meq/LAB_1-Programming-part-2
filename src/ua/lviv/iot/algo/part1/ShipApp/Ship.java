package ua.lviv.iot.algo.part1.ShipApp;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ship {
    private double id = 10.4;
    private String name;
    private String captain;
    private String currentPort;
    private double maxSpeed;
    private double maxCapacity;
    private double currentLoad;
    private double currentSpeed;
    private static Ship instance;

    public String dock(String port)
    {
        return currentPort = port;
    }

    public void setSpeed(double speed)
    {
        if(speed >= 0.0) {
            currentSpeed = speed;
        }
    }

    public void load(double weight)
    {
        if(weight + currentLoad <= maxCapacity) {
            currentLoad += weight;
        }
        else {
            currentLoad = maxCapacity;
        }
    }

    public void unload(double weight)
    {
        if(currentLoad - weight >= 0.0) {
            currentLoad -= weight;
        }
        else {
            currentLoad = 0.0;
        }
    }

    public static Ship getInstance()
    {
        if(instance == null){
            instance = new Ship();
        }
        return instance;
    }

    public static void main(String[] args)
    {
        Ship ship1 = new Ship();
        Ship ship2 = new Ship(4.2,"Meteora","Mike Shinoda",
                "Fort Minor", 18.2,4.5,3.1,10.4);
        Ship[] ships = {ship1,ship2,getInstance(),getInstance()};
        ships[1].load(1.2);
        ships[1].unload(2.5);

        for(Ship ship : ships)
        {
            System.out.println(ship.toString());
        }
    }
}