package edu.epam.array.service;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumServiceTest {

    SumService sumService;

    @BeforeTest
    public void setUp() {
        this.sumService = new SumService();
    }

    @Test
    public void testGetSumOfArrayElements() {
        int[] array = {1, 2, 3};
        int result = sumService.getSumOfArrayElements(array);
        int expResult = 6;

        assertEquals(result, expResult);
    }

    @AfterTest
    public void tierDown() {
        this.sumService = null;
    }
}