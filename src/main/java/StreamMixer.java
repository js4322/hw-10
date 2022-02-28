import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMixer {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        final Iterator<T> itFirst = first.iterator();
        final Iterator<T> itSecond = second.iterator();
        List<T> result = new ArrayList<T>();
        while (itFirst.hasNext() && itSecond.hasNext()) {
            result.add(itFirst.next());
            result.add(itSecond.next());
        }
        return result.stream();
    }
}
