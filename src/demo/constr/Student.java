package demo.constr;

public class Student {
    int rollno;
    String name;

    // default

    // it is present by default in every class if there is no construcor present

    Student(){

    }

    Student (int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

}
class Main{
    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.name);
    }
}






