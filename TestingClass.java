import java.util.*;

public class TestingClass
{
    public static void main(String[] args)
    {
        Map<String, Integer> months = new LinkedHashMap<>(Map.ofEntries(
                Map.entry("January", 1),
                Map.entry("February", 2),
                Map.entry("March", 3),
                Map.entry("April", 4),
                Map.entry("May", 5),
                Map.entry("June", 6),
                Map.entry("July", 7),
                Map.entry("August", 8),
                Map.entry("September", 9),
                Map.entry("October", 10),
                Map.entry("November", 11),
                Map.entry("December", 12)
        ));

        Set<String> monthNames = months.keySet();
        System.out.printf("Set view of keys: %s%n", monthNames);

        List<Integer> cardinalMonth = new ArrayList<>(months.values());
        System.out.printf("List of values: %s%n", cardinalMonth);

        Integer[] cardinalMonthArray = months.values().toArray(new Integer[0]);
        System.out.printf("Array of values: %s%n", Arrays.toString(cardinalMonthArray));
    }
}