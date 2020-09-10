public class IfStatement {
    public static void main(String[] args) {

        int diceRoll = 3;
        switch (diceRoll){
            case 1:
                System.out.println("Good roll");
                break;
            case 2:
                System.out.println("Roll again");
                break;
            case 3:
                System.out.println("You win!");
                break;
            default:
                System.out.println("You lose");

        }
    }
}
