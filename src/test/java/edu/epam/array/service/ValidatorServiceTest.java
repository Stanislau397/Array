package edu.epam.array.service;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ValidatorServiceTest {

    ValidatorService validator;

    @BeforeTest
    public void setUp() {
        validator = new ValidatorService();
    }

    @Test
    public void testIsPrimeNumberTrue() {
        int value = 5;
        boolean condition = validator.isPrimeNumber(value);
        assertTrue(condition);
    }

    @Test
    public void testIsPrimeNumberFalse() {
        int value = 6;
        boolean condition = validator.isPrimeNumber(value);
        assertFalse(condition);
    }

    @Test
    public void testIsPerfectSquare() {
        int number = 121;
        boolean condition = validator.isPerfectSquare(number);
        assertTrue(condition);
    }

    @Test
    public void testIsFibonacciNumberTrue() {
        int number = 3;
        boolean condition = validator.isFibonacciNumber(number);
        assertTrue(condition);
    }

    @Test
    public void testIsFibonacciNumberFalse() {
        int number = 6;
        boolean condition = validator.isFibonacciNumber(number);
        assertFalse(condition);
    }

    @Test
    public void testIsThreeDigitNumberTrue() {
        int number = 675;
        boolean condition = validator.isThreeDigitNumber(number);
        assertTrue(condition);
    }

    @Test
    public void testIsThreeDigitNumberFalse() {
        int number = 67;
        boolean condition = validator.isThreeDigitNumber(number);
        assertFalse(condition);
    }

    @Test
    public void testIsNonRepeatedThreeDigitNumberTrue() {
        int number = 675;
        boolean condition = validator.isNonRepeatedThreeDigitNumber(number);
        assertTrue(condition);
    }

    @Test
    public void testIsNonRepeatedThreeDigitNumberFalse() {
        int number = 655;
        boolean condition = validator.isNonRepeatedThreeDigitNumber(number);
        assertFalse(condition);
    }

    public void tierDown() {
        this.validator = null;
    }
}