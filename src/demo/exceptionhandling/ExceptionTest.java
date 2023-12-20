package demo.exceptionhandling;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        if(age < 18){
            throw new RuntimeException("Invalid age exception");
        }
        else{
            System.out.println("You can vote normally");
        }

    }
}
