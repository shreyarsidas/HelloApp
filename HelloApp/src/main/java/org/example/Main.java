package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StringBuilder namesBuilder = new StringBuilder();
        String[] names;

        if (args.length > 0) {
            // Use command-line arguments
            names = args;
        } else {
            // Take user input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter names (space-separated): ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Hello, World!");
                sc.close();
                return;
            }

            names = input.split("\\s+");
            sc.close();
        }

        // Enhanced for loop
        int count = 0;
        for (String name : names) {
            namesBuilder.append(name);
            count++;

            if (count < names.length) {
                namesBuilder.append(", ");
            }
        }

        System.out.println("Hello, " + namesBuilder + "!");
    }
}
