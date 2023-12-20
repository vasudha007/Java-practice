package demo.inheritancedemo;

public class Telephone {

    // properties  / member variables
    String color; // null, constructor
    double price;

    // behaviour
    // methods // member functions

    public void makeCalls(){
        System.out.println("Telephone is making call");
    }

    public void receiveCalls(){
        System.out.println("Telephone can receive calls ");
    }

    public void ring(){
        System.out.println("Telephone is ringing");
    }
}
