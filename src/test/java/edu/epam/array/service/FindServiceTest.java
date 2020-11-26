package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;
import edu.epam.array.util.FileScanner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FindServiceTest {

    FindService findService;
    FileScanner fileScanner;
    static final String PATH = "src\\main\\java\\edu\\epam\\partA\\file\\Integers";

    @BeforeTest
    public void setUp() {
        this.findService = new FindService();
        this.fileScanner = new FileScanner();
    }

    @Test
    public void testFindIndexOfNumberInArray() {
        int[] numbers = fileScanner.readIntegersFromFile(PATH);
        int key = 7;
        NumberArray numberArray = new NumberArray(numbers);
        int result = findService.findIndexOfNumberInArray(numberArray, key);
        int expResult = 4;

        assertEquals(result, expResult);
    }

    @Test
    public void testFindMaxNumberInArray() {
        int[] numbers = fileScanner.readIntegersFromFile(PATH);
        NumberArray numberArray = new NumberArray(numbers);

        int result = findService.findMaxNumberInArray(numberArray);
        int expResult = 251;

        assertEquals(result, expResult);
    }

    @Test
    public void testFindMinNumberInArray() {
        int[] numbers = fileScanner.readIntegersFromFile(PATH);
        NumberArray numberArray = new NumberArray(numbers);

        int result = findService.findMinNumberInArray(numberArray);
        int expResult = 2;

        assertEquals(result, expResult);
    }

    @AfterTest
    public void tierDown() {
        this.findService = null;
        this.fileScanner = null;
    }
}