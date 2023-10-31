/*
5. Create an array of characters containing from the 'A' to the 'Z' (only
uppercase). Then, you can ask for positions of the array by keyboard and if the
position is correct, it will be added to a string that will be shown at the end.
Program stops when user introduce a -1 by the keyboard.
 */

package exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] characters = new char[26];
        fillArray(characters);

        String word = returnString(characters, sc);
        System.out.println("The resulting string is: " + word);


    }

    public static void fillArray(char[] array) {
        char caracter = 'A';

        for (int i = 0; i < array.length; i++) {
            array[i] = caracter;
            caracter++;
        }
    }

    public static String returnString(char[] array, Scanner sc) {
        String word = "";
        int position;

        do {

            System.out.print("Write a position: ");
            position = sc.nextInt();

            if (position >= 0 && position <= 25) {
                word += array[position];

            } else if (position > 25 || position < -1) {
                System.out.println("¡¡ POSITION ERROR !!");
            }

        } while (position != -1);

        return word;
    }

}
