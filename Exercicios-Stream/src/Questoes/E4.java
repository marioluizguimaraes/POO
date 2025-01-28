package Questoes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E4 {
    public static void executar() {
        List<String> nomes = Arrays.asList("Ana", "João", "Maria", "Pedro");
        String resultado = nomes.stream().collect(Collectors.joining(", "));
        System.out.println("Resultado: " + resultado);
    }
}
