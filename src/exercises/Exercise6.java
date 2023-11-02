/*
6. Create a program that calculates the letter of the DNI of any person. To
calculate the letter you must divide the DNI by 23, and the rest look for it in
the following list:
 */

package exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] letters = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        int position = returnPosition(sc);
        System.out.println("The letter that corresponds to the DNI is " + letters[position]);
    }

    // Method that returns the position of the array to which the indicated number corresponds
    public static int returnPosition(Scanner sc) {
        int dni, position;

        System.out.print("Write your DNI number without the letter: ");
        dni = sc.nextInt();

        position = dni % 23;

        return position;
    }
}
