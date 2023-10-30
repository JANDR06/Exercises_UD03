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
    }

    public static void fillArray(int[] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = (int) (Math.random() * 10);
        }

    }

    // Method to view the values of the matrix also showing its position
    public static void showArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("POSITION: " + i + " VALUE: " + array[i]);
        }

    }
}
