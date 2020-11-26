package edu.epam.array.entity;

import java.util.Arrays;

public class NumberJaggedArray {

    private int[][] jaggedArray;

    public NumberJaggedArray(int[][] jaggedArray) {
        this.jaggedArray = jaggedArray;
    }

    public int[][] getJaggedArray() {
        return Arrays.copyOf(jaggedArray, jaggedArray.length);
    }

    public void setJaggedArray(int[][] jaggedArray) {
        this.jaggedArray = jaggedArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumberJaggedArray)) return false;

        NumberJaggedArray that = (NumberJaggedArray) o;


        return Arrays.deepEquals(jaggedArray, that.jaggedArray);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(jaggedArray);
    }

    @Override
    public String toString() {
        return Arrays.toString(jaggedArray);
    }
}
