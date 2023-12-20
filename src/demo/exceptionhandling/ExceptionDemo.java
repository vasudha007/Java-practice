package demo.exceptionhandling;

import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int userInput = scanner.nextInt();

            int result = 100 / userInput;
            System.out.println("Result: " + result);

            int[] numbers = {1, 2, 3};
            System.out.print("Enter an index to get a number: ");
            int index = scanner.nextInt();

            System.out.println("Number at index " + index + ": " + numbers[index]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Please enter a non-zero number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Please enter a valid index for the array.");
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch. Please enter an integer.");
            scanner.nextLine(); // Clear the invalid input from scanner
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("After exception handling.");
    }
}
