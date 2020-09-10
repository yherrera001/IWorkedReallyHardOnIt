public class Question2 {

        public static double buyingSneaks(double discount, int price){
            double discounted = price-(price * discount); //how much was deducted
            double finalAnswer = price - discount; //the whole price

            return finalAnswer;

        }

        public static void main(String[] args) {
            System.out.println(buyingSneaks(10,100));

        }
    }

