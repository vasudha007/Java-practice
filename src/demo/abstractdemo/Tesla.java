package demo.abstractdemo;

public class Tesla extends Car{
    @Override
    public void steering() {
        System.out.println("it has weird steering wheel");
    }

    @Override
    public void engine() {
        System.out.println("It has electric engine ");
    }
}
