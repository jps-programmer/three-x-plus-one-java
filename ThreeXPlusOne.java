// ThreeXPlusOne v0.1 © Jameson Sisk 2022

import java.util.Scanner;

public class ThreeXPlusOne {

    public static void main(String[] args) { // This part of the code gets the number as an input from the user

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter a number");

        double input = myObj.nextDouble();

        threeX(input); // This calls the threeX function with a double functioning as the number type, mostly so the largest numbers possible with Java can be rendered

    }

    public static double threeX(double number) { // This performs the mathematical problem and prints the number after every step in the calculation

        while (number > 1) {
            if (number % 2 == 0) {
                number = number / 2;
            }
            else if (number % 2 != 0) {
                number = (number * 3) + 1;
            }
            System.out.println(number);
        }

        return number; // This returns the final output, which is always one, in case the user wants to do something more with it

    }

}
