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
        return port;
    }

    public double setSpeed(double speed)
    {
        if(speed >= 0.0) {
            return speed;
        }
        else {
            System.out.println("incorrect speed");
        }
        return speed;
    }

    public void load(double weight)
    {
        if(weight + currentLoad <= maxCapacity) {
            currentLoad += weight;
        }
        else {
            System.out.println("a ship cannot carry such a weight");
        }
    }

    public void unload(double weight)
    {
        if(currentLoad - weight >= 0.0) {
            currentLoad -= weight;
        }
        else {
            System.out.println("such weight does not exist to unload");
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
        int lengthOfArray = 4;
        Ship[] ships = new Ship[lengthOfArray];
        ships[0] = new Ship();
        ships[1] = new Ship(4.2,"Meteora","Mike Shinoda",
                "Fort Minor", 18.2,4.5,3.1,10.4);
        ships[2] = getInstance();
        ships[3] = getInstance();
        ships[1].load(1.2);
        ships[1].unload(2.5);

        for(Ship ship : ships)
        {
            System.out.println(ship.toString());
        }
    }
}