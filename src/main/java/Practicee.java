public class Practicee {
    public static void main(String[] args) {
        //Use substring method
        String firstname = "Christopher";
        String secondName = "Lloyd";
        System.out.println(firstname.substring(0,5)); //extract chris. counted 5 characters
        System.out.println(firstname.equals(secondName));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstname);
        stringBuilder.append(secondName);
        System.out.println(stringBuilder);

    }
}
