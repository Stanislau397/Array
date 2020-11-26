package edu.epam.array.service;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SmallestNumberServiceTest {

    SmallestNumberService smallestNumberService;

    @BeforeTest
    public void setUp() {
        this.smallestNumberService = new SmallestNumberService();
    }

    @Test
    public void testGetSmallestNumber() {
        int[] array = {1, 2, 3};
        int result = smallestNumberService.getSmallestNumber(array);
        int expResult = 1;

        assertEquals(result, expResult);
    }

    @AfterTest
    public void tierDown() {
        this.smallestNumberService = null;
    }
}