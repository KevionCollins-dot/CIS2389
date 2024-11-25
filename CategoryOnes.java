import java.util.List;

public class CategoryOnes extends Category{
   public CategoryOnes(String n){
      super(n);
   }

   public boolean isMatch(List<Die> dice){
      return true;
   }
   
}