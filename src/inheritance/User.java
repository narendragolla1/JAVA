package inheritance;

public class User {
    String name;
    String email;
    String password;
    void updateEmail(String newEmail){
        this.email=newEmail;
    }
    void changePassword(String newPassword)
    {
        this.password=newPassword;
    }
}
