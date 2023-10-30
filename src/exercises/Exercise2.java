/*
2. Create an array of numbers where the size of the array will be determined by
the user (keyboard), then fill the array with random numbers between 0 and 9, and
at the end show in the screen the value of each position and the sum of all
values. Make four methods:

- A method to fill the array (having as parameters the range - lower and upper
  limit - of the random numbers generated).
- A method to show the content.
- A method to sum the array.
- A method to generate random number (you can use it for other exercises).
 */

package exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Write the size you want the matrix to have: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        fillArray(array);
        System.out.println();

        showArray(array);
        System.out.println();

        int sumArray = sumArray(array);
        System.out.println("The sum of all the values in the array is: " + sumArray);
    }

    // Method to fill the array with random numbers from 0 to 9
    public static void fillArray(int[] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = (int) (Math.random() * 10);
        }

    }

    // Method to view the values of the array also showing its position
    public static void showArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("POSITION: " + i + " VALUE: " + array[i]);
        }

    }

    // Method to add the values of the array
    public static int sumArray(int[] array) {
        int sumArray = 0;

        for (int element : array) {
            sumArray += element;
        }

        return sumArray;
    }

    // Method to generate random numbers
}
