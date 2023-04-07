package ua.lviv.iot.algo.part1.ShipApp;
import java.util.ArrayList;
import java.util.List;


public class ShipManager extends addShip {

    private final static List<Ship> ships  = new ArrayList<>();

    @Override
    public void addShip(Ship ship) {
        ships.add(ship);
    }

    @Override
    public List<Ship> findAllWithMoreThanLoad(double currentLoad) {
        return ships.stream().filter(
                (n) -> (n.currentLoad) > currentLoad).toList();
    }

    @Override
    public List<Ship> findAllWithMoreThanCapacity(double maxCapacity) {
        return ships.stream().filter(
                (n) -> (n.maxCapacity) > maxCapacity).toList();
    }

    public  static void main(String[] args){
        ShipManager manager = new ShipManager();

        manager.addShip(new TunkerShip(10.6,"gasoline",20.4,"TunkerShip 1",
                "Mike Shinoda","Odessa",13.5,50.2,40.2,
                11.5,15,28));

        manager.addShip(new TunkerShip(16.9,"crude oil",10.5,"TunkerShip 2",
                "Joe Hahn","Lisbon",15,60.2,20.6,
                13.6,20,36));

        manager.addShip(new ROROShip(15,12.7,"cars",11.6,"ROROShip 1",
                " Brad Delson","LA",18.6,15.6,12.5,
                16.6,17,21));

        manager.addShip(new ROROShip(23,15.2,"trucks",12.7,"ROROShip 2",
                " Dave Farrell","Boston",22,25.6,23.6,
                21,18,22));

        manager.addShip(new ContainerShip(2,2,"raw materials",15.6,"ContainerShip 1",
                " Rob Bourdon","Lviv",19.5,125,102,
                18.5,20,35));

        manager.addShip(new ContainerShip(2,2,"foodstuffs",18.7,"ContainerShip 2",
                "Tom Cruise","Shanghai",17.7,110.5,65,
                15.6,27,45));

        manager.addShip(new CruiseShip(150,10.2,"CruiseShip 1",
                "Cristiano Ronaldo.","Hong Kong",21.6,76.5,76.5,
                16.7,60,30));

        manager.addShip(new CruiseShip(200,10.6,"CruiseShip 2",
                "Mr Beast","Singapore",24.0,100,80,
                23.0,45,36));

        List<Ship> ShipWithCapacityGreaterThan = manager.findAllWithMoreThanLoad(50);
        for (Ship ship:ShipWithCapacityGreaterThan) {
            System.out.println(ship);
        }

        List<Ship> ShipWithLoadGreaterThan= manager.findAllWithMoreThanCapacity(65);
        ShipWithLoadGreaterThan.stream().forEach(a->System.out.println(a));
    }
}