package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What size of sandwich you want to pick?\n1. Regular: base price $5.45\n2. Large: base price $8.95");
        int pick = sc.nextInt();
        double regular = 5.45;
        double large = 8.95;
        double price = 0;
        if (pick == 1){
            price = regular;
        }
        else if(pick == 2){
            price = large;
        }
        else {
            System.out.println("We don't have option: " + pick + ". Choose again!");
            return;
        }
        System.out.println("Would you like to load your sandwich with extra toppings?\n(1)Yes   (2)No");
        int loadedSandwich = sc.nextInt();
        if (loadedSandwich == 1){
            double extraRegular = 1;
            double extraLarge = 1.75;
            double loadedPrice = 0;
            System.out.println("Pick your extra topping;\n1. Regular:$1.00\n2. Large:$1.75");
            int extraPick = sc.nextInt();
            if (extraPick == 1){
                price += extraRegular;
            }
            else if (extraPick == 2) {
                price += extraLarge;
            }
        }
        System.out.print("Enter your age for discount check: ");
        int age = sc.nextInt();
        double youngAgeDiscount = 0.10;
        double olderAgeDiscount = 0.20;
        if (age <= 17 ){
            System.out.println("You have 10% discount, final price is: " + (youngAgeDiscount * price));
        }
        else if (age >= 65 ){
            System.out.println("You have 20% discount, final price is: " + (olderAgeDiscount * price));
        }
        else {
            System.out.println("Your final amount: $" + price);
        }
    }

}

