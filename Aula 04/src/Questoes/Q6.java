package Questoes;

import java.util.Scanner;

public class Q6 {
    public static void ValidacaooNota(){
        int nota1, nota2;
        Scanner sc = new Scanner(System.in);

        nota1 = sc.nextInt();
        while (nota1 < 0 || nota1 > 10){
            System.out.println("nota invalida");
            nota1 = sc.nextInt();
        }

        nota2 = sc.nextInt();
        while (nota2 < 0 || nota2 > 10){
            System.out.println("nota invalida");
            nota2 = sc.nextInt();
        }

        double media = (double) (nota1 + nota2) /2;
        System.out.printf("media = %.2f ", media);
    }
}
