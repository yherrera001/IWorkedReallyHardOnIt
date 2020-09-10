public class Question4 {
    public static double squaringNumber(int x){
       //I have to use math.pow
        double square = Math.pow(x,2);
        return square;
    }

    public static void main(String[] args) {
        System.out.println(squaringNumber(10));
    }
}