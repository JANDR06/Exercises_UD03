/*
3. Make an array of numbers for storing 100 integers which will be contain
numbers from 1 to 100. Get the sum of all of them and the average.
 */

package exercises;

public class Exercise3 {
    public static void main(String[] args) {

        int[] array = new int[100];

        Exercise2.fillArray(array, 1, 100);
        Exercise2.showArray(array);

        System.out.println();

        int sumArray = Exercise2.sumArray(array);
        System.out.println("The sum of all the values in the array is: " + sumArray);
        double average = average(array);
        System.out.println("The average of all the values in the array is: " + average);
    }

    // Method to obtain the average of the array values.
    public static double average(int[] array) {
        double summation =  Exercise2.sumArray(array);
        summation /=  array.length;
        return summation;
    }
}
