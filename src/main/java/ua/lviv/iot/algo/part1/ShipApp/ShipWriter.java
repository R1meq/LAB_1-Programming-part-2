package ua.lviv.iot.algo.part1.ShipApp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class ShipWriter {
    private static final String FILE_PATH = "C:\\Users\\roman\\IdeaProjects\\Lab_1_Java_\\result.csv";

    public static void writeToFile(final List<Ship> ships) {
        if(ships == null || ships.isEmpty()) {
            return;
        }
        try(FileWriter fileWriter = new FileWriter(FILE_PATH)) {
            ships.sort(Comparator.comparing((Ship k)-> k.getClass().getSimpleName()));
            Class<?> currentClass = null;
            for(Ship ship:ships){
                Class<?> shipClass = ship.getClass();
                if(shipClass!=currentClass) {
                    fileWriter.write(ship.getHeaders() + System.lineSeparator());
                    currentClass = shipClass;
                }
                fileWriter.write(ship.toCSV() + System.lineSeparator());
              }
            } catch (IOException e) {
            System.out.println("Error accrued");
        }
    }
}
