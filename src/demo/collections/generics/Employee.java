package demo.collections.generics;

public class Employee<a,b> {

    // id , name

    a id;
    b name;

    public Employee(a id, b name) {
        this.id = id;
        this.name = name;
    }

    public a getId() {
        return id;
    }

    public void setId(a id) {
        this.id = id;
    }

    public b getName() {
        return name;
    }

    public void setName(b name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee<Integer,Integer> employee =new Employee(23,45);

    }
}
