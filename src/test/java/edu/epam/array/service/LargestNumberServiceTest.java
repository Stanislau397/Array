package edu.epam.array.service;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LargestNumberServiceTest {

    LargestNumberService largestNumberService;

    @BeforeTest
    public void setUp() {
        this.largestNumberService = new LargestNumberService();
    }

    @Test
    public void testGetLargestNumber() {
        int[] array = {1, 2, 3};
        int result = largestNumberService.getLargestNumber(array);
        int expResult = 3;

        assertEquals(result, expResult);
    }

    @AfterTest
    public void tierDown() {
        this.largestNumberService = null;
    }
}