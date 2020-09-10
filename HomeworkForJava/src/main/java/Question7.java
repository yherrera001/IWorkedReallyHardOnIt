public class Question7 {

    public static void printingNumbers() {

        for (int i = 45; i > 0; i--) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("YearUp");
            }
            else if (i % 3 == 0) {
                System.out.println("Year");
            }
            else if (i % 5 == 0) {
                System.out.println("Up");
            }
            else{
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printingNumbers();
    }
}
