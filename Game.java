import java.util.List;

public class Game{
   private List<Player> players;
   private Player currentPlayer;
   private List<Die> dice;
   
   public Game(List<Player> p){
      players = p;
   }

   public void startGame(){
      ;
   }

   public void nextTurn(){
      ;
   }

   public Boolean isGameOver(){
      return false;
   }

   public void declareWinner(){
      ;
   }
}