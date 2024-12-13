import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class CategorySmallStraight extends Category{
   public CategorySmallStraight(String n){
      super(n);
   }
   
   @Override
   public boolean isMatch(List<Die> dice){
      Set<Integer> uniqueValues = dice.stream().map(Die::getFaceValue).collect(Collectors.toSet());
      return uniqueValues.containsAll(Set.of(1, 2, 3, 4)) ||
             uniqueValues.containsAll(Set.of(2, 3, 4, 5)) ||
             uniqueValues.containsAll(Set.of(3, 4, 5, 6));
   }
   
   @Override
   public int calculateScore(List<Die> dice){
      if(isMatch(dice)){
         value = 30;
      } else {
         value = 0;
      }
      return value;
   }
}