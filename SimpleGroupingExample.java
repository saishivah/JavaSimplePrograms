import java.util.*;
import java.util.stream.Collectors;

public class SimpleGroupingExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
            "Alice", "Bob", "Anna", "Bill", "Carol"
        );

        // Group names by their first letter
        Map<Character, List<String>> namesByFirstLetter = names.stream()
            .collect(Collectors.groupingBy(
                name -> name.charAt(0)
            ));

        // Print results
        namesByFirstLetter.forEach((letter, nameList) -> {
            System.out.println(letter + ": " + nameList);
        });
    }
}