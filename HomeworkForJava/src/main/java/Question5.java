public class Question5 {
//5)
//Write a while loop that prints only even numbers from 10 - 0 but once the loop gets to 5 break out of the loop

    public static void loopy() {
        int limit = 10;
        int floor = 0;
        while (floor <= limit) {
            if (limit ==5){
                break;
            }
            if (limit % 2 == 0) {
                System.out.println(limit);
            }
            limit--;
        }

    }
    public static void main(String[] args) {
        loopy();

    }
}
