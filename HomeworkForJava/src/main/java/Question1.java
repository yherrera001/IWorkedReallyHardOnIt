import java.util.Scanner;

/**
 * Isaiah helped me solve
 */
public class Question1 {
//instance field
    private String password;


    //creating method
    public boolean checkPassword(String attemptedPassword){
        return attemptedPassword.equals(password);
    }

    public void setPassword(String attemptedPassword) {
       password = attemptedPassword;

    }


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Question1 question1 = new Question1();
    question1.setPassword("boy");
    for(int i = 0; true; i++){
        System.out.println("Please provide a password to login");
        if (question1.checkPassword(scanner.next())) {
            System.out.println("Logged in successfully.\nNumber of failed attempts: " + i);
            break;
        }
    }


    }
}
