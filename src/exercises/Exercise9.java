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

        int aboveAverage = topHeight(heights);
        int belowAverage = heightBottom(heights);
        System.out.println("There are " + aboveAverage +  " people who measure above the average person");
        System.out.println("There are " + belowAverage +  " people who measure below the average person");
    }

    // Method for the user to write an integer
    public static int returnInteger(Scanner sc) {
        System.out.print("Enter a value: ");
        return sc.nextInt();
    }

    // Method to fill the array by heights written by the user
    public static void fillArray(double[] array, Scanner sc) {

        for (int i = 0; i < array.length; i++) {
            System.out.print("Write the height for position " + i + " of the array: ");
            array[i] = sc.nextDouble();
        }
    }

    // Method that calculates the average of the heights
    public static double average(double[] array) {
        double sumValues = 0;

        for (double element : array) {
            sumValues += element;
        }

        return sumValues / array.length;
    }

    // Method that calculates the number of people who measure above the average
    public static int topHeight(double[] array) {
        int count = 0;

        for(double element : array) {
            if (element > average(array)) {
                count++;
            }
        }

        return count;
    }

    // Method that calculates the number of people who measure below the average
    public static int heightBottom(double[] array) {
        int count = 0;

        for(double element : array) {
            if (element < average(array)) {
                count++;
            }
        }

        return count;
    }


}
