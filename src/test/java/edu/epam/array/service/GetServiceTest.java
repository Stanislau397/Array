package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class GetServiceTest {

    GetService getService;
    ValidatorService validator;

    @BeforeTest
    public void setUp() {
        this.getService = new GetService();
        this.validator = new ValidatorService();
    }

    @Test
    public void testGetPrimeNumbersInArray() {
        NumberArray numberArray = new NumberArray(5, 4, 3);
        int[] result = getService.getPrimeNumbersInArray(numberArray, validator);
        int size = 2;
        int[] expResult = new int[size];
        expResult[0] = 3;
        expResult[1] = 5;

        Assert.assertEquals(result, expResult);
    }

    @Test
    public void testGetFibonacciNumbers() {
        NumberArray numberArray = new NumberArray(5, 4, 3);
        int[] result = getService.getFibonacciNumbers(numberArray, validator);
        int size = 2;
        int[] expResult = new int[size];
        expResult[0] = 5;
        expResult[1] = 3;

        Assert.assertEquals(result, expResult);
    }

    @Test
    public void testGetNonRepeatedThreeDigitNumbers() {
        NumberArray numberArray = new NumberArray(525, 541, 535);
        int[] result = getService.getNonRepeatedThreeDigitNumbers(numberArray, validator);
        int[] expResult = new int[1];
        expResult[0] = 541;

        Assert.assertEquals(result, expResult);
    }

    @AfterTest
    public void tierDown() {
        this.getService = null;
        this.validator = null;
    }
}