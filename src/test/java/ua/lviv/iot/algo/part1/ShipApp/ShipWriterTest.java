package ua.lviv.iot.algo.part1.ShipApp;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class ShipWriterTest {
    private static final String RESULT_FILE = "C:\\Users\\roman\\IdeaProjects\\Lab_1_Java_\\result.csv";
    private static final String EXPECTED_FILE = "C:\\Users\\roman\\IdeaProjects\\Lab_1_Java_\\expected.csv";
    private ShipWriter shipWriter;
    private List<Ship> ships;

    @Before
    public void setUp () throws IOException {
        shipWriter = new ShipWriter();
        ships = new LinkedList<>();
        Files.deleteIfExists(Path.of(RESULT_FILE));
    }


    @AfterAll
    public static void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILE));
    }

    @Test
    public void testEmptyWrite() {
        shipWriter.writeToFile(null);
        File file = new File(RESULT_FILE);
        Assertions.assertFalse(file.exists());
    }

    @Test
    public void testWriteListOfShips() throws IOException {
        ships.add(new TunkerShip(10.6,"gasoline",20.4,"TunkerShip 1",
                        "Mike Shinoda","Odessa",13.5,50.2,40.2,
                        11.5,15,28,44.5));

        ships.add(new TunkerShip(16.9,"crude oil",10.5,"TunkerShip 2",
                "Joe Hahn","Lisbon",15,60.2,20.6,
                13.6,20,36,65.7));

        ships.add(new RoroShip(15,12.7,"cars",11.6,"ROROShip 1",
                " Brad Delson","LA",18.6,15.6,12.5,
                16.6,17,21));

        ships.add(new RoroShip(23,15.2,"trucks",12.7,"ROROShip 2",
                " Dave Farrell","Boston",22,25.6,23.6,
                21,18,22));

        ships.add(new ContainerShip(2,2,"raw materials",15.6,"ContainerShip 1",
                "Rob Bourdon","Lviv",19.5,125,102,
                18.5,20,35));

        ships.add(new ContainerShip(2,2,"foodstuffs",18.7,"ContainerShip 2",
                "Tom Cruise","Shanghai",17.7,110.5,65,
                15.6,27,45));

        ships.add(new CruiseShip(150,10.2,"CruiseShip 1",
                "Cristiano Ronaldo","Hong Kong",21.6,76.5,76.5,
                16.7,60,30));

        ships.add(new CruiseShip(200,10.6,"CruiseShip 2",
                "Mr Beast","Singapore",24.0,100,80,
                23.0,45,36));

        ShipWriter.writeToFile(ships);
        Path expected = new File(RESULT_FILE).toPath();
        Path actual = new File(EXPECTED_FILE).toPath();
        Assertions.assertEquals(-1L, Files.mismatch(expected,actual));
    }

    @Test
    public void testFileOverride() throws IOException {
      try(FileWriter fileWriter = new FileWriter(RESULT_FILE)){
          fileWriter.write("QWERTY");
      } catch (IOException e){
          System.out.println("Error accrued");
      }
      testWriteListOfShips();

      int lineCountResult = 0;
      int lineCountExpected = 0;
      try(BufferedReader bufferedReaderResult
                  = new BufferedReader(new FileReader(RESULT_FILE));
          BufferedReader bufferedReaderExpected
                  = new BufferedReader(new FileReader(EXPECTED_FILE))){
          int c;
          while((c = bufferedReaderResult.read()) != -1)
              lineCountResult++;

          while((c = bufferedReaderExpected.read()) !=-1)
              lineCountExpected++;
      }catch (IOException e){
          System.out.println("Error accrued");
      }
      Assertions.assertEquals(lineCountExpected,lineCountResult);
   }
}
