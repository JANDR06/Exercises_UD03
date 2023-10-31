/*
9. Create Java program to read the height of N people and calculate the average
height. Calculate how many people have a height above the average and how many
have a height below the average. The value of N is requested by keyboard and must
be a positive integer.
 */

package exercises;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = returnInteger(sc);
        double[] heights = new double[n];

        System.out.println();

        fillArray(heights, sc);
        System.out.println();

        double heightAverage = average(heights);
        System.out.println("Average: " + heightAverage);


    }

    public static int returnInteger(Scanner sc) {
        System.out.print("Enter a value: ");
        return sc.nextInt();
    }

    public static void fillArray(double[] array, Scanner sc) {

        for (int i = 0; i < array.length; i++) {
            System.out.print("Write the height for position " + i + " of the array: ");
            array[i] = sc.nextDouble();
        }
    }

    public static double average(double[] array) {
        double sumValues = 0;

        for (double element : array) {
            sumValues += element;
        }

        return sumValues / array.length;
    }


}
