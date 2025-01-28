package Questoes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Final3 {
    public static void executar() {
        List<String> palavras = Arrays.asList("java", "stream", "api", "exemplo", "programação", "map");
        Map<Integer, List<String>> agrupadas = palavras.stream().collect(Collectors.groupingBy(String::length));
        agrupadas.forEach((tamanho, lista) -> System.out.println(tamanho + ": " + lista));
    }
}
