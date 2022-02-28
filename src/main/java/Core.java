import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Core {
    public static void main(String[] args) {
        String[] names = {"a1","b2","c3","d4","e5","f6","g7"};
        final List<String> namesList = Arrays.asList(names);
        System.out.println("NameFilter.filterNames(namesList) = " + NameFilter.filterNames(namesList));
        System.out.println("StringListRebuilder.rebuild(namesList) = " + StringListRebuilder.rebuild(namesList));
        String[] numbers = {"fcg1","2khj","hcg3","4","5","11","dhf12","ty13li","14dhvb","1","53","52","5vjyvg1"};
        System.out.println("NumberParser.parseAndSort(numbers) = " + NumberParser.parseAndSort(numbers));
        final Stream<String> first = Stream.of("a", "b", "c", "d", "e", "f", "g", "h");
        final Stream<Integer> second = Stream.of(1, 2, 3, 4, 5);
        StreamMixer.zip(first, second.map(e -> e + ""))
                .peek(System.out::print)
                .collect(Collectors.toList());
        // a = 25214903917,
        // c = 11 и
        // m = 2^48 (2 в степени 48)
        System.out.println('\n');
        RandomStream.infinityStream(25214903917l, 11l, (long) Math.pow(2, 48), 3)
                .filter(e->Math.abs(e)<1000000)
                .peek(e-> System.out.println(e))
                .count();
    }
}
