package demo.polymorphs;

class Computer {

    public void surfInternet(){
        System.out.println("surf Internet");
    }

}
public class Laptop extends Computer{

    @Override
    public void surfInternet() {
        System.out.println("You can surf with wifi also ");
    }

}
class Dell extends Laptop{
    @Override
    public void surfInternet() {
        System.out.println("You can surf with wifi also ");
    }
}
class Main{
    public static void main(String[] args) {
        // Parent           Child

        Computer dell = new Dell();
        dell.surfInternet();

    }
}

// Parent class - Computer
// Child class - Laptop
//Upcasting --- child class's object can be assigned to parent class reference.
