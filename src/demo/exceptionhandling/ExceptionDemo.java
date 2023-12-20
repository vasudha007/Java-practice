package demo.exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x  = 10;
        int y = 0;
        try {

            int division = x / y;
            System.out.println(division);
            System.out.println("will not work .... ");

        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }

        System.out.println("This is after exception");
    }
}
