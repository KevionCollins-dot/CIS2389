import java.util.List;
import java.util.ArrayList;

public class GameDriver{
   public static void main(String[] args){
      List<Player> players = new ArrayList<Player>();
      players.add(new Player("Dustin"));
      Game game = new Game(players);
      
   }
}