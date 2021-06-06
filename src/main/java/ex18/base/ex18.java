package ex18.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String choice = input.nextLine();

        System.out.print((choice.equals("C") || choice.equals("c")) ? "Please enter the temperature in Fahrenheit: " : "Please enter the temperature in Celsius: ");
        double temp = input.nextDouble();
        //int temp = Integer.parseInt(str1);
        double convert = 0;

        if(choice.equals("C") || choice.equals("c")) {
            convert = (temp - 32) * (0.55555);
        }
        if(choice.equals("F") || choice.equals("f")) {
            convert = (temp * (1.8)) + 32;
        }

        System.out.println((choice.equals("C") || choice.equals("c")) ? "The temperature in Celsius is " + (int) convert + "." : "The temperature in Fahrenheit is " + (int) convert + ".");

    }
}
