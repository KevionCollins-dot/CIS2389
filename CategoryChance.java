import java.util.List;

public class CategoryChance extends Category{
   public CategoryChance(String n){
      super(n);
   }
   
   @Override
   public boolean isMatch(List<Die> dice){
      return true;
   }
   
   @Override
   public int calculateScore(List<Die> dice){
      value = dice.stream().mapToInt(Die::getFaceValue).sum();
      return value;
   }
}