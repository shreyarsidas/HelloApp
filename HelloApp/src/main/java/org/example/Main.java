package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Handle empty input
        if (name.trim().isEmpty()) {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");

        sc.close();
    }
}
