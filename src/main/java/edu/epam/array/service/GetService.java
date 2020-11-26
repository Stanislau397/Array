package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;

import java.util.ArrayList;
import java.util.List;

public class GetService {

    public int[] getPrimeNumbersInArray(NumberArray numbers, ValidatorService validator) {
        int countPrimeNumbers = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (validator.isPrimeNumber(numbers.get(i))) {
                countPrimeNumbers = countPrimeNumbers + 1;
            }
        }
        int[] primeNumbers = new int[countPrimeNumbers];
        int index = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (validator.isPrimeNumber(numbers.get(i))) {
                primeNumbers[index] = numbers.get(i);
                index = index + 1;
            }
        }
        return primeNumbers;
    }

    public int[] getFibonacciNumbers(NumberArray numbers, ValidatorService validator) {
        int countFibonacciNumbers = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (validator.isFibonacciNumber(numbers.get(i))) {
                countFibonacciNumbers = countFibonacciNumbers + 1;
            }
        }
        int[] fibonacciNumbers = new int[countFibonacciNumbers];
        int index = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (validator.isFibonacciNumber(numbers.get(i))) {

                fibonacciNumbers[index] = numbers.get(i);
                index = index + 1;
            }
        }
        return fibonacciNumbers;
    }

    public int[] getNonRepeatedThreeDigitNumbers(NumberArray numbers, ValidatorService validator) {
        int countThreeDigitNumbers = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (validator.isThreeDigitNumber(numbers.get(i))
                    && validator.isNonRepeatedThreeDigitNumber(numbers.get(i))) {

                countThreeDigitNumbers = countThreeDigitNumbers + 1;
            }
        }
        int[] threeDigitNumbers = new int[countThreeDigitNumbers];
        int index = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (validator.isThreeDigitNumber(numbers.get(i))
                    && validator.isNonRepeatedThreeDigitNumber(numbers.get(i))) {

                threeDigitNumbers[index] = numbers.get(i);
                index = index + 1;
            }
        }
        return threeDigitNumbers;
    }
}
