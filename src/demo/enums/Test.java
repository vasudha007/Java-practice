package demo.enums;

public class Test {
    public static void main(String[] args) {

        TimHortons timHortons = TimHortons.small;
        System.out.println(timHortons);

    }
}

enum TimHortons{
    small, large
}
