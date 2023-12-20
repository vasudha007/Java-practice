package demo.encapsulation;

public class UserLogin {

    int x = 10;

   private String username;// vasudha
   private String password; // 12345

                    // vasudha              12345
    public UserLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }


    public void makeLogin(String uname, String pass){ // parameters

        // vasudha  == abc      && 12345  ===  123
        if(username.equals(uname) && password.equals(pass)){
            System.out.println("successful login ");
        }
        else{
            System.out.println("Invalid credentials");
        }
    }




}
