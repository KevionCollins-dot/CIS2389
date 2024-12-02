import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CategoryFullHouse extends Category{
   public CategoryFullHouse(String n){
      super(n);
   }

   public boolean isMatch(List<Die> dice){
      int[] counts = new int[5];
      for(int i=0; i<dice.size(); i++){
         counts[i] = count(dice, dice.get(i).getFaceValue());
      }
      if(findMin(counts) == 2 && findMax(counts) == 3){
         return true;
      }
      return false;
   }
   
   public int count(List<Die> dice, int value){
      int result = 0;
      for(Die d: dice){
         if(d.getFaceValue() == value){
            result++;
         }
      }
      return result;
   }
   
   public int calculateScore(List<Die> dice){
      if(isMatch(dice)){
         return 25;
      }
      return 0;
   }
   
}