package ua.lviv.iot.algo.part1.ShipApp.writers;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import ua.lviv.iot.algo.part1.ShipApp.models.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static ua.lviv.iot.algo.part1.ShipApp.AbstractTestUtils.prepareListOfShips;

public class ShipWriterTest {
    private static final String RESULT_FILE = "result.csv";
    private static final String EXPECTED_FILE = "expected.csv";
    private ShipWriter shipWriter;
    private List<Ship> ships;

    @Before
    public void setUp() throws IOException {
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
        ships = prepareListOfShips();

        ShipWriter.writeToFile(ships);
        Path expected = new File(RESULT_FILE).toPath();
        Path actual = new File(EXPECTED_FILE).toPath();
        Assertions.assertEquals(-1L, Files.mismatch(expected, actual));
    }

    @Test
    public void testFileOverride() throws IOException {
        try (FileWriter fileWriter = new FileWriter(RESULT_FILE)) {
            fileWriter.write("QWERTY");
        } catch (IOException e) {
            System.out.println("Error accrued");
        }
        testWriteListOfShips();

        int lineCountResult = 0;
        int lineCountExpected = 0;
        try (BufferedReader bufferedReaderResult
                     = new BufferedReader(new FileReader(RESULT_FILE));
             BufferedReader bufferedReaderExpected
                     = new BufferedReader(new FileReader(EXPECTED_FILE))) {
            int c;
            while ((c = bufferedReaderResult.read()) != -1)
                lineCountResult++;

            while ((c = bufferedReaderExpected.read()) != -1)
                lineCountExpected++;
        } catch (IOException e) {
            System.out.println("Error accrued");
        }
        Assertions.assertEquals(lineCountExpected, lineCountResult);
    }
}
