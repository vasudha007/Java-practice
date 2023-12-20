package demo.collections.generics;

public class Container {

    Object item1; // 12
    Object item2; // 23

    public Container(Object item1, Object item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public Object getItem1() {
        return item1;
    }

    public void setItem1(Object item1) {
        this.item1 = item1;
    }

    public Object getItem2() {
        return item2;
    }

    public void setItem2(Object item2) {
        this.item2 = item2;
    }

    public void printItems(){
        System.out.println("Item 1 " + item1);
        System.out.println("Item 2 " + item2);
    }
}

class Main{
    public static void main(String[] args) {
        Container container = new Container("Test" ,23);
        String item1 = (String)container.getItem1();
        System.out.println(item1);

        System.out.println(item1 + " something");

        int item2 = (int)container.getItem2();
        System.out.println(item2);

        System.out.println(item2 + 25);
    }
}
