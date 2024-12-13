import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategoryYahtzee extends Category {

    public CategoryYahtzee(String n) {
        super(n);
    }

    @Override
    public boolean isMatch(List<Die> dice) {
        Map<Integer, Long> counts = dice.stream()
                                         .collect(Collectors.groupingBy(Die::getFaceValue, Collectors.counting()));
        return counts.values().stream().anyMatch(count -> count >= 5);
    }

    @Override
    public int calculateScore(List<Die> dice) {
        if (isMatch(dice)) {
           value = 50;
        } else {
            value = 0;
        }
        return value;
    }
}