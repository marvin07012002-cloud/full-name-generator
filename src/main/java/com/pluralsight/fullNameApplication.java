package com.pluralsight;


import java.util.Scanner;

public class fullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First name: ");
        String first = scanner.nextLine();


        System.out.println("Middle name: ");
        String middle = scanner.nextLine();


        System.out.println("Last name: ");
        String last = scanner.nextLine();

        System.out.println("Suffix: ");
        String suffix = scanner.nextLine();



        first = first.trim();
        middle = middle.trim();
        last = last.trim();
        suffix = suffix.trim();

        String fullName = first;

        if(!middle.isEmpty()){

            fullName = fullName + " " + middle;
        }

        fullName = fullName + " " + last;

        if(!suffix.isEmpty()){
            fullName = fullName + ", " + suffix;

        }

        System.out.println("Full name: " + fullName);


    }
}