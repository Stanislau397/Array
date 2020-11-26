package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortServiceTest {

    SortService sortService;

    @BeforeTest
    public void setUp() {
        this.sortService = new SortService();
    }

    @Test
    public void testGetBubbleSortedArray() {
        NumberArray numberArray = new NumberArray(5, 4, 3, 2);
        int[] result = sortService.bubbleSortedArray(numberArray);
        int[] expResult = new int[4];
        expResult[0] = 2;
        expResult[1] = 3;
        expResult[2] = 4;
        expResult[3] = 5;

        assertEquals(result, expResult);

    }

    @Test
    public void testGetSelectionSortedArray() {
        NumberArray numberArray = new NumberArray(5, 4, 3, 2);
        int[] result = sortService.selectionSortedArray(numberArray);
        int[] expResult = new int[4];
        expResult[0] = 2;
        expResult[1] = 3;
        expResult[2] = 4;
        expResult[3] = 5;

        assertEquals(result, expResult);
    }

    @Test
    public void testGetInsertionSortedArray() {
        NumberArray numberArray = new NumberArray(5, 4, 3, 2);
        int[] result = sortService.insertionSortedArray(numberArray);
        int[] expResult = new int[4];
        expResult[0] = 2;
        expResult[1] = 3;
        expResult[2] = 4;
        expResult[3] = 5;

        assertEquals(result, expResult);
    }

    @AfterTest
    public void tierDown() {
        this.sortService = null;
    }
}