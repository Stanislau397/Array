package edu.epam.array.util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

    private static final Logger logger = LogManager.getLogger(FileScanner.class);

    public int countIntegersInFile(String path) {
        int count = 0;

        try (Scanner scanner = new Scanner(new File(path))) {

            while (scanner.hasNext()) {
                scanner.next();
                count = count + 1;
            }
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, e.getMessage());
        }

        return count;
    }

    public int[] readIntegersFromFile(String path) {
        int size = countIntegersInFile(path);
        int i = 0;
        int[] integersArray = new int[size];

        try (Scanner scanner = new Scanner(new File(path))) {

            while (scanner.hasNext()) {
                integersArray[i] = scanner.nextInt();
                i = i + 1;
            }

        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, e.getMessage());
        }

        return integersArray;
    }
}
