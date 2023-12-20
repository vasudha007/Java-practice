package demo.encapsulation;

public class UserLoginDemo {
    public static void main(String[] args) {



        // Object 2  or user 2
        // password and username set by vasudha is vasudha and 12345
        // data base record already set and no one should change
        UserLogin vasudha = new UserLogin("vasudha","12345");

        vasudha.makeLogin("vasudha","12345");
        System.out.println(vasudha.getUsername());



    }
}
