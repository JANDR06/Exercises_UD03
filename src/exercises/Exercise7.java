/*
7. Create a program with 10 integers entered by the keyboard. The program must
be able to know how many numbers are positive, negative or cero.
 */

package exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        Exercise1.fillMatrix(numbers, sc);
        System.out.println();

        int positives = positivesQuantity(numbers), negatives = negativesQuantity(numbers), zeros = zerosQuantity(numbers);
        System.out.println("Number of positives: " + positives);
        System.out.println("Number of negatives: " + negatives);
        System.out.println("Number of zeros: " + zeros);
    }

    // Method that returns the number of positive numbers
    public static int positivesQuantity(int[] array) {
        int positives = 0;

        for (int element : array) {
            if (element > 0) {
                positives++;
            }
        }

        return positives;
    }

    // Method that returns the number of negative numbers
    public static int negativesQuantity(int[] array) {
        int negatives = 0;

        for (int element : array) {
            if (element < 0) {
                negatives++;
            }
        }

        return negatives;
    }

    // Method that returns the number of zeros numbers
    public static int zerosQuantity(int[] array) {
        int zeros = 0;

        for (int element : array) {
            if (element == 0) {
                zeros++;
            }
        }

        return zeros;
    }
}
