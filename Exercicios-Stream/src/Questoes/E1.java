package Questoes;

import java.util.Arrays;
import java.util.List;

public class E1 {
    public static void executar() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
