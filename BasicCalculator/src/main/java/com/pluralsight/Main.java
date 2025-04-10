package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        float firstValue = sc.nextFloat();
        System.out.println("Enter second value: ");
        float secondValue = sc.nextFloat();
        System.out.println("First value: " + firstValue + "    " + "Second value: " + secondValue);
        System.out.println("Which operation want to use? \n(A)dd \n(S)ubtract \n(M)ultiply \n(D)ivide");
        char input = sc.next().charAt(0);

        if (input == 'A' || input == 'a'){
            float sum = firstValue + secondValue;
            System.out.printf("Sum of values = %.2f", sum);
        }
        else if (input == 'S' || input == 's') {
            float subtract = firstValue - secondValue;
            System.out.printf("Subtracted values: %.2f", subtract);
        }
        else if (input == 'M' || input == 'm') {
            float multiply = firstValue * secondValue;
            System.out.printf("Multiplied values: %.2f", multiply);
        }
        else if (input == 'D' || input == 'd') {
            float divide = firstValue / secondValue;
            System.out.printf("Divided values: %.2f", divide);
        }
        else {
            System.out.println("Wrong letter, try again!");
        }
    }
}
