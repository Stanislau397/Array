package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;
import edu.epam.array.entity.NumberJaggedArray;
import edu.epam.array.service.api.ICompareArrays;

public class SortService {

    public int[] bubbleSortedArray(NumberArray array) {
        int[] bubbleSortedArray = array.getNumbers();

        for (int i = 0; i < bubbleSortedArray.length - 1; i++) {
            for (int j = 0; j < bubbleSortedArray.length - i - 1; j++) {

                if (bubbleSortedArray[j] > bubbleSortedArray[j + 1]) {

                    int temp = bubbleSortedArray[j];
                    bubbleSortedArray[j] = bubbleSortedArray[j + 1];
                    bubbleSortedArray[j + 1] = temp;
                }
            }
        }
        return bubbleSortedArray;
    }

    public int[] selectionSortedArray(NumberArray numbers) {
        int[] selectionSortedArray = numbers.getNumbers();

        for (int i = 0; i < selectionSortedArray.length; i++) {

            int min = selectionSortedArray[i];
            int minId = i;

            for (int j = i; j < selectionSortedArray.length; j++) {

                if (selectionSortedArray[j] < min) {
                    min = selectionSortedArray[j];
                    minId = j;
                }
            }
            if (min < selectionSortedArray[i]) {
                int temp = selectionSortedArray[i];
                selectionSortedArray[i] = selectionSortedArray[minId];
                selectionSortedArray[minId] = temp;
            }
        }

        return selectionSortedArray;
    }

    public int[] insertionSortedArray(NumberArray numbers) {
        int[] insertionSortedArray = numbers.getNumbers();

        for (int i = 1; i < insertionSortedArray.length; i++) {

            int current = insertionSortedArray[i];
            int j = i - 1;

            while (j >= 0 && current < insertionSortedArray[j]) {
                insertionSortedArray[j + 1] = insertionSortedArray[j];
                j = j - 1;
            }

            insertionSortedArray[j + 1] = current;
        }

        return insertionSortedArray;
    }

    public int[][] sortJaggedArrayInAscendingOrder(NumberJaggedArray numberJaggedArray, SwapService swapService, ICompareArrays iCompare) {
        int[][] jaggedArray = numberJaggedArray.getJaggedArray();

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray.length; j++) {
                if (iCompare.compare(jaggedArray[i], jaggedArray[j]) < 0) {
                    swapService.swap(jaggedArray, i, j);
                }
            }
        }
        return jaggedArray;
    }

    public int[][] sortJaggedArrayInDescendingOrder(NumberJaggedArray numberJaggedArray, SwapService swapService, ICompareArrays iCompare) {
        int[][] jaggedArray = numberJaggedArray.getJaggedArray();

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray.length; j++) {
                if (iCompare.compare(jaggedArray[i],jaggedArray[j]) > 0) {
                    swapService.swap(jaggedArray, i, j);
                }
            }
        }
        return jaggedArray;
    }
}

