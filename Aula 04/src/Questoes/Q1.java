package Questoes;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

    public static void listaDeAlunos(){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int sorteado = sc.nextInt();

        String[] alunos = new String[total];

        for (int i = 0; i < total; i++){
            alunos[i] = sc.next();
        }
        Arrays.sort(alunos);

        for (int i = 0; i < total; i++){
            System.out.println((i+1) + " - " + alunos[i]);
        }
        System.out.println("-------Sorteado-------");
        System.out.println(alunos[sorteado-1]);
    }

}
