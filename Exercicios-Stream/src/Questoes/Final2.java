package Questoes;

import java.util.Arrays;
import java.util.List;

public class Final2 {
    public static void executar() {
        List<Integer> numeros = Arrays.asList(30, 55, 60, 45, 70, 80, 25);
        double media = numeros.stream().filter(n -> n > 50).mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Média: " + media);
    }
}
