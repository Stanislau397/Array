package edu.epam.array.util;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileScannerTest {

    static final String PATH = "file.txt";
    FileScanner fileScanner;

    @BeforeTest
    public void setUp() {
        this.fileScanner = new FileScanner();
    }

    @Test
    public void testCountIntegersInFile() {
        int result = fileScanner.countIntegersInFile(PATH);
        int expected = 3;

        assertEquals(result, expected);
    }

    @Test
    public void testGetIntegersFromFile() {
        int[] result = fileScanner.readIntegersFromFile(PATH);
        int[] expResult = new int[3];
        expResult[0] = 5;
        expResult[1] = 6;
        expResult[2] = 2;

        assertEquals(result, expResult);
    }

    @AfterTest
    public void tierDown() {
        this.fileScanner = null;
    }
}