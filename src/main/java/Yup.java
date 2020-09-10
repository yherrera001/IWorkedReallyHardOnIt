public class Yup {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outter loop i" + i);
            //Nested loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("inner loop j" + j);
            }
            System.out.println();
        }
    }
}
