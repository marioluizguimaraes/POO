package Questoes;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class E6 {
    public static void executar() {
        List<Integer> numeros = new Random().ints(1000, 1, 10001).boxed().collect(Collectors.toList());
        
        int maior = numeros.parallelStream().max(Comparator.naturalOrder()).orElseThrow();

        System.out.println("Maior número: " + maior);
    }
}
