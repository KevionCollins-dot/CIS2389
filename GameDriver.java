import java.util.List;
import java.util.ArrayList;

public class GameDriver{
   public static void main(String[] args){
      List<Player> players = new ArrayList<Player>();
      players.add(new Player("Dustin"));
      players.add(new Player("Kevion"));
      players.add(new Player("Nathan"));
      players.add(new Player("William"));
      Game game = new Game(players);
      game.startGame();
      System.out.println("**");
      while(!game.isGameOver()){
         System.out.println(game.getRound()+") "+game.getCurrentPlayer());
         game.playersTurn();
         game.nextTurn();
      }
      
   }
}