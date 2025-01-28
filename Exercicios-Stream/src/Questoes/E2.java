package Questoes;
import java.util.Arrays;
import java.util.List;

public class E2 {
    public static void executar() {
        List<String> palavras = Arrays.asList("stream", "exemplo", "java", "tutorial");
        palavras.stream().filter(p -> p.length() > 5).map(String::toUpperCase).forEach(System.out::println);
    }
}
