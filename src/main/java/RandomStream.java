import java.util.stream.Stream;

public class RandomStream {
    public static Stream<Long> infinityStream(long a, long c, long m, long seed){
        return Stream.iterate(seed, e->(a*e+c) % m);
    }
    //x[0] = seed
    // x[n + 1] = 1 (a x[n] + c) % m, для корректных значений a, c, и m.
    // Необходимо имплементировать метод, который принимает на вход параметрыa, c, m и seed
    // и возвращает Stream<Long>.
    // Для теста используйте данные
    // a = 25214903917,
    // c = 11 и
    // m = 2^48 (2 в степени 48).
}
