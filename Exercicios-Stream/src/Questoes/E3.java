package Questoes;

import java.util.Arrays;
import java.util.List;

public class E3 {
    public static void executar() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int soma = numeros.stream().reduce(0, Integer::sum);
        System.out.println("Soma: " + soma);
    }
}
