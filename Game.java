import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Game{
   private List<Player> players;
   private Player currentPlayer;
   private List<Die> dice;
   private int round;
   private Scanner keyboard = new Scanner(System.in);
   
   public Game(List<Player> p){
      dice = new ArrayList<Die>();
      players = p;
      for(int i=0; i<5; i++){
         Die d = new Die();
         d.roll();
         dice.add(d);
      }
   }

   public void startGame(){
      currentPlayer = players.get(0);
      round = 1;
   }
   
   public void playersTurn(){
      for(Die d: dice){
         d.roll();
      }
      int count = 0;
      do{//do while to limit the number of rerolls
         System.out.println("Dice = "+dice);
         System.out.print("Enter index of dice to reroll or zero to keep all: ");
         String[] strChoice = keyboard.nextLine().split(",");
         int[] intChoice = new int[strChoice.length];
         for(int i=0; i<strChoice.length; i++){
            intChoice[i] = Integer.parseInt(strChoice[i]);
         }
         System.out.println(Arrays.toString(intChoice));
         count++;
         //TODO given the array intChoice if it does not contain zero then reroll the appropriate dice
      }while(count < 3 and intChoice[0] != 0);
      //Now that the rolls are done, show the available options to put in the scorecard
      //Have the user select an option and update the score
   }

   public void nextTurn(){
      int nextPlayerIndex = (players.indexOf(currentPlayer)+1) % players.size();
      if(nextPlayerIndex == 0){
         round++;
      }
      currentPlayer = players.get(nextPlayerIndex);
   }

   public Boolean isGameOver(){
      return round > 13;
   }

   public void declareWinner(){
      //TODO find and declare winner
      ;
   }
   
   public Player getCurrentPlayer(){
      return currentPlayer;
   }
   
   public int getRound(){
      return round;
   }
}