package edu.epam.array.service;

public class SwapService {

    public void swap(int[][] array, int currentRow, int nextRow) {
        int[] jaggedArray;

        jaggedArray = array[nextRow];
        array[nextRow] = array[currentRow];
        array[currentRow] = jaggedArray;
    }
}
