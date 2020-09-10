import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class Question6 {
    public static void scanner(){
        Scanner object = new Scanner(System.in); //created a scanner object

        int numberGrade = object.nextInt(); //reading the input

        if(numberGrade<=100 && numberGrade>=90){
            System.out.println("You got an A!!!!");
        }
        if(numberGrade<=89 && numberGrade>=80){
            System.out.println("You got a B!");
        }
        if(numberGrade<=79 && numberGrade>=70){
            System.out.println("You got a C!");
        } if(numberGrade<=69 && numberGrade>=60){
            System.out.println("You got a D!!");
        } if(numberGrade<=59)
            System.out.println("You got an F.");
    }

    public static void main(String[] args) {
        System.out.println("Student number grade is ");
        scanner();
    }

}