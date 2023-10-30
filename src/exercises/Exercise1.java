/*
1. Create an array of 10 numbers, values will be entered by keyboard. Then,
display by console the index and the value of all the elements. You have to
perform two methods, one to fill the element values and another one to show them.
 */

package exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] matrix = new int[10];

        fillMatrix(matrix, sc);
        System.out.println();

        showMatrix(matrix);
    }

    // Method that asks the user to fill out the matrix
    public static void fillMatrix(int[] matrix, Scanner sc) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Write an integer value for the position " + i + ": ");
            matrix[i] = sc.nextInt();
        }

    }

    // Method to view the values of the matrix also showing its position
    public static void showMatrix(int[] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("POSITION: " + i + " VALUE: " + matrix[i]);
        }

    }
}
