package Str;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        processInput();
    }

    public static void processInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            String input = scanner.nextLine();
            double number = Double.parseDouble(input);

            if (number == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                double reciprocal = 1 / number;
                System.out.println("The reciprocal of " + number + " is: " + reciprocal);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
