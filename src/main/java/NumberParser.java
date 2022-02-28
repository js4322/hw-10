import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class NumberParser {
    public static String parseAndSort(String[] input){

        return Arrays.stream(input)
                .map(e->e.replaceAll("[^0123456789]+", ""))
                .map(e->Integer.parseInt(e))
                .sorted(Comparator.naturalOrder())
                .map(e->e+"")
                .collect(Collectors.joining(", "));

    }
}
