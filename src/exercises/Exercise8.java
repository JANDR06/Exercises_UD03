/*
8. Create a program for filling an array with 10 integers entered by user by
keyboard. Then calculate and show the average of the positive values and the
negative values of the array.
 */

package exercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        Exercise1.fillMatrix(numbers, sc);
        System.out.println();

        int positivesAverage, negativesAverage;
        positivesAverage = positivesSum(numbers) / Exercise7.positivesQuantity(numbers);
        negativesAverage = negativesSum(numbers) / Exercise7.negativesQuantity(numbers);

        System.out.println("Average of the positive values of the array: " + positivesAverage);
        System.out.println("Average of the negative values of the array: " + negativesAverage);
    }

    // Method that returns the sum of positive numbers
    public static int positivesSum(int[] array) {
        int sum = 0;

        for (int element : array) {
            if (element > 0) {
                sum += element;
            }
        }

        return sum;
    }

    // Method that returns the sum of negative numbers
    public static int negativesSum(int[] array) {
        int sum = 0;

        for (int element : array) {
            if (element < 0) {
                sum += element;
            }
        }

        return sum;
    }
}
