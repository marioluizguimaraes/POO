package Questoes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Final1 {
    static class Pessoa {
        String nome;
        int idade;

        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }
    }

    public static void executar() {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 22),
                new Pessoa("João", 15),
                new Pessoa("Maria", 30),
                new Pessoa("Pedro", 18)
        );
        List<String> nomes = pessoas.stream().filter(p -> p.getIdade() > 18).map(Pessoa::getNome).sorted().collect(Collectors.toList());

        System.out.println(nomes);
    }
}
