package com.pluralsight;

import java.util.Scanner;

public class fullNameParser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input = input.trim();

        String[] parts = input.split(" ");


        if (parts.length == 2) {
            String first = parts[0];
            String middle = "(none)";
            String last = parts[2];


            System.out.println("First name: " + first);
            System.out.println("Middle name: " + middle);
            System.out.println("Last name : " + last);

        } else if (parts.length == 3) {
            String first = parts[0];
            String middle = parts[1];
            String last = parts[2];


            System.out.println("First name: " + first);
            System.out.println("Middle name: " + middle);
            System.out.println("Last name : " + last);

        }
        else if (parts.length == 4) {
            String first = parts[0];
            String middle = parts[1];
            String last = parts[2];


            System.out.println("First name: " + first);
            System.out.println("Middle name: " + middle);
            System.out.println("Last name : " + last);

        }
    }
}
