import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CategoryFullHouse extends Category{
   public CategoryFullHouse(String n){
      super(n);
   }

   public boolean isMatch(List<Die> dice){
      ArrayList<Die> d = (ArrayList<Die>)dice;
      Collections.sort(d);
      return true;
   }
   
   public int calculateScore(List<Die> dice){
      if(isMatch(dice)){
         return 25;
      }
      return 0;
   }
   
}