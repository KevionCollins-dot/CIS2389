import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategoryFullHouse extends Category {

    public CategoryFullHouse(String n) {
        super(n);
    }

    @Override
    public boolean isMatch(List<Die> dice) {
        Map<Integer, Long> counts = dice.stream()
                                         .collect(Collectors.groupingBy(Die::getFaceValue, Collectors.counting()));
        return counts.values().contains(3L) && counts.values().contains(2L);
    }

    @Override
    public int calculateScore(List<Die> dice) {
        if (isMatch(dice)) {
            value = 25; // Full House has a fixed score of 25 points
        } else {
            value = 0;
        }
        return value;
    }

    
    private int findMin(List<Die> dice) {
        return dice.stream().mapToInt(Die::getFaceValue).min().orElse(0);
    }

    
    private int findMax(List<Die> dice) {
        return dice.stream().mapToInt(Die::getFaceValue).max().orElse(0);
    }
}
