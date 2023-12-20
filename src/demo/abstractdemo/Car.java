package demo.abstractdemo;

public abstract class Car {
    public abstract void steering();
    public abstract void engine();

    // non-abstract method
    public void test(){
        System.out.println("testing... ");
    }
}