package edu.epam.array.entity;

import java.util.Arrays;

public class NumberArray {

    private int[] numbers;

    public NumberArray(int... numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int size() {
        return numbers.length;
    }

    public int get(int index) {
        return numbers[index];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumberArray)) return false;

        NumberArray that = (NumberArray) o;

        return Arrays.equals(numbers, that.numbers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(numbers);
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
