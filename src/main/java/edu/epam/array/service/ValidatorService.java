package edu.epam.array.service;

public class ValidatorService {

    public boolean isPrimeNumber(int number) {
        int i = 2;
        while (i <= number / 2) {
            if (number % i == 0) {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    public boolean isThreeDigitNumber(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count = count + 1;
        }
        return count == 3;
    }

    public boolean isNonRepeatedThreeDigitNumber(int number) {
        int first = number % 10;
        int second = (number / 10) % 10;
        int third = (number / 100) % 10;

        return (first != second && second != third && first != third);
    }

    public boolean isFibonacciNumber(int number) {
        return isPerfectSquare(5 * number * number + 4)
                || isPerfectSquare(5 * number * number - 4);
    }

    public boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return number == sqrt * sqrt;
    }
}
