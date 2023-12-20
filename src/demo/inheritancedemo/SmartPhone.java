package demo.inheritancedemo;

public class SmartPhone extends Telephone{

    @Override
    public void makeCalls() {
        System.out.println("Smartphone is making calls ");
    }

    @Override
    public void receiveCalls() {
        System.out.println("Smart is receiving calls ");
    }

    @Override
    public void ring() {
        System.out.println("SMartphone is rining ");
    }
}
