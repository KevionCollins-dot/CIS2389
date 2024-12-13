import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategoryFourOfAKind extends Category {

    public CategoryFourOfAKind(String n) {
        super(n);
    }

    @Override
    public boolean isMatch(List<Die> dice) {
        Map<Integer, Long> counts = dice.stream()
                                         .collect(Collectors.groupingBy(Die::getFaceValue, Collectors.counting()));
        return counts.values().stream().anyMatch(count -> count >= 4);
    }

    @Override
    public int calculateScore(List<Die> dice) {
        if (isMatch(dice)) {
            value = dice.stream().mapToInt(Die::getFaceValue).sum(); // Sum of all dice values
        } else {
            value = 0;
        }
        return value;
    }
}
