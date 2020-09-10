import java.util.Scanner;

public class Circle {
    public static double calculatingAreaOfCircle(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Radius");
        double userInput1 = scan.nextInt();

        System.out.println("Radius");
        double userInput2 = scan.nextInt();

        return userInput1 * userInput2;
    }
    public static void main(String[] args) {
        System.out.println(calculatingAreaOfCircle());
    }
}
