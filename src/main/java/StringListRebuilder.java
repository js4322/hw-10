import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringListRebuilder {
    public static List<String> rebuild(List<String> inputList){
        return inputList.stream()
                .map(a->a.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
