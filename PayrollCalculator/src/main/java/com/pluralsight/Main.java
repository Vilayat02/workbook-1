package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter worked hours: ");
        float hours = sc.nextFloat();
        System.out.print("Enter pay rate: ");
        float rate = sc.nextFloat();
        rate *= hours;
        if (hours >= 40){
            rate *= 1.5;
            System.out.println("You will get 1.5x on your pay rate because it's over than 40 hours");
        }
        System.out.println("All info: \nName: " + name);
        System.out.println("Worked hours: " + hours);
        System.out.println("Rate Pay: " + rate);

    }
}
