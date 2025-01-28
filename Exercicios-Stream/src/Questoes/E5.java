package Questoes;

import java.util.stream.IntStream;

public class E5 {
    public static void executar() {
        IntStream.range(1, 21).filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
