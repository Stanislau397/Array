package edu.epam.array.service;

import edu.epam.array.service.api.ICompareArrays;

public class SumService implements ICompareArrays {

    @Override
    public int compare(int[] one, int[] two) {
        if (getSumOfArrayElements(one) > getSumOfArrayElements(two)) {
            return 1;
        } else if (getSumOfArrayElements(one) < getSumOfArrayElements(two)) {
            return -1;
        }
        return 0;
    }

    public int getSumOfArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
