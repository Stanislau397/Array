package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;

public class FindService {

    public int findIndexOfNumberInArray(NumberArray numbers, int key) {
        int left = 0;
        int right = numbers.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (key < numbers.get(mid)) {
                right = mid - 1;
            } else if (key > numbers.get(mid)) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public int findMaxNumberInArray(NumberArray numbers) {
        int max = 0;
        int[] numbersArray = numbers.getNumbers();

        for (Integer value : numbersArray) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int findMinNumberInArray(NumberArray numbers) {
        int min = numbers.get(0);
        int[] numbersArray = numbers.getNumbers();

        for (Integer value : numbersArray) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
