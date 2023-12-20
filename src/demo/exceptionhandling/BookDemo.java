package demo.exceptionhandling;

import java.util.Scanner;

public class BookDemo {

    public static void test() throws NullPointerException{
            String s = null;
            System.out.println(s.toLowerCase());
            System.out.println("in the test method");
    }

    public static void show() throws NullPointerException{
        test();
    }

    public static void main(String[] args) {

        try {
            show();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("In the main method");
    }

}
