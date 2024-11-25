import java.util.List;

public class Scorecard{
   private List<Category> scoreList;
   private Integer overallScore;
   
   public Scorecard(){
      //TODO create all 13 categories for the scorecard
      scoreList = new ArrayList<Category>();
      scoreList.add(new CategoryOnes("ones"));
   }

   public int calculateCategoryScore(Category category, List<Die> dice){
      return 0;
   }

   public boolean isCategoryAvailable(Category category){
      return false;
   }

  }