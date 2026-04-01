package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Check if at least one argument is passed
        if (args.length > 0) {
            String name = args[0];   // First command-line argument
            System.out.println("Hello, " + name + "!");
        } else {
            // Default message if no argument is provided
            System.out.println("Hello, World!");
        }
    }
}