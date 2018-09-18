public class DiceGame {
    public static void main(String[] args) {

        Die dice1 = new Die();
        dice1.roll();

       Die dice2 = new Die();
       dice2.roll();

       if(dice1.getFaceValue() + dice2.getFaceValue() == 7)
       {
           System.out.println("You win! Winner winner chicken dinner");
       }
       else {
           System.out.println("You lose! Take the L!");
       }


    }
}
