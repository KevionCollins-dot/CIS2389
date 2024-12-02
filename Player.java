public class Player{
   private String name;
   private Scorecard scorecard;
   
   public Player(String n){
      name = n;
      scorecard = new Scorecard();
   }
   
   public Scorecard getScorecard(){
      return scorecard;
   }
   
   public String getName(){
      return name;
   }
   
   public String toString(){
      return name + ": "+ scorecard.getOverallScore();
   }
}