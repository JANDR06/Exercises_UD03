/*
4. Create an array of numbers having a size entered by user (keyboard). The array
will contain random prime numbers within a desired range. Finally, the program
shows the largest one.
 */

package exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[Exercise2.sizeArray(sc)];
        fillArray(array, 0, 200);
        System.out.println("The maximum value of the array is: " + maxValue(array));

    }

    public static void fillArray(int[] matrix, int lower, int upper) {
        int primeNumber;

        for (int i = 0; i < matrix.length; i++) {
            do {
                primeNumber = Exercise2.generateRandomNumber(lower, upper);
            } while (!isPrime(primeNumber));

            matrix[i] = primeNumber;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static int maxValue(int[] array) {
        int maxValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                maxValue = array[i];
            }

            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }
}
