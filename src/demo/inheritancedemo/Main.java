package demo.inheritancedemo;

public class Main {
    public static void main(String[] args) {
       /* Telephone telephone = new Telephone();
        telephone.makeCalls();
        telephone.receiveCalls();
        telephone.ring();*/

       /* SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCalls();
        smartPhone.receiveCalls();
        smartPhone.ring();*/

        Iphone iphone = new Iphone();
        iphone.makeCalls();
        iphone.receiveCalls();
        iphone.ring();
        iphone.heySiri();

    }
}
