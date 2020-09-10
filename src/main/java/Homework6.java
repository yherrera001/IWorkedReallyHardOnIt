public class Homework6 {
    public static void multiply(int[] array){

        for(int element : array){
            System.out.println(element *3);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        multiply(array);
    }
}
