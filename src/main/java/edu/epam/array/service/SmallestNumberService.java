package edu.epam.array.service;

import edu.epam.array.service.api.ICompareArrays;

public class SmallestNumberService implements ICompareArrays {

    @Override
    public int compare(int[] one, int[] two) {
        if (getSmallestNumber(one) > getSmallestNumber(two)) {
            return 1;
        } else if (getSmallestNumber(one) < getSmallestNumber(two)) {
            return -1;
        }
        return 0;
    }

    public int getSmallestNumber(int[] array) {
        int smallestNumber = array[0];

        for (Integer number : array) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        return smallestNumber;
    }
}
