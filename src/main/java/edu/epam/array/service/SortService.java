package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;
import edu.epam.array.entity.NumberJaggedArray;
import edu.epam.array.service.api.ICompareArrays;

public class SortService {

    public int[] bubbleSortedArray(NumberArray array) {
        int[] bubbleArray = array.getNumbers();

        for (int i = 0; i < bubbleArray.length - 1; i++) {
            for (int j = 0; j < bubbleArray.length - i - 1; j++) {

                if (bubbleArray[j] > bubbleArray[j + 1]) {

                    int temp = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j + 1];
                    bubbleArray[j + 1] = temp;
                }
            }
        }
        return bubbleArray;
    }

    public int[] selectionSortedArray(NumberArray numbers) {
        int[] selectionArray = numbers.getNumbers();

        for (int i = 0; i < selectionArray.length; i++) {

            int min = selectionArray[i];
            int minId = i;

            for (int j = i; j < selectionArray.length; j++) {

                if (selectionArray[j] < min) {
                    min = selectionArray[j];
                    minId = j;
                }
            }
            if (min < selectionArray[i]) {
                int temp = selectionArray[i];
                selectionArray[i] = selectionArray[minId];
                selectionArray[minId] = temp;
            }
        }

        return selectionArray;
    }

    public int[] insertionSortedArray(NumberArray numbers) {
        int[] insertionArray = numbers.getNumbers();

        for (int i = 1; i < insertionArray.length; i++) {

            int current = insertionArray[i];
            int j = i - 1;

            while (j >= 0 && current < insertionArray[j]) {
                insertionArray[j + 1] = insertionArray[j];
                j = j - 1;
            }

            insertionArray[j + 1] = current;
        }

        return insertionArray;
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
                if (iCompare.compare(jaggedArray[i], jaggedArray[j]) > 0) {
                    swapService.swap(jaggedArray, i, j);
                }
            }
        }
        return jaggedArray;
    }
}

