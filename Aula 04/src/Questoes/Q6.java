package Questoes;

import java.util.Scanner;

public class Q6 {
    public static void ValidacaooNota(){
        double nota1, nota2;
        Scanner sc = new Scanner(System.in);

        nota1 = sc.nextDouble();
        while (nota1 < 0 || nota1 > 10){
            System.out.println("nota invalida");
            nota1 = sc.nextDouble();
        }

        nota2 = sc.nextDouble();
        while (nota2 < 0 || nota2 > 10){
            System.out.println("nota invalida");
            nota2 = sc.nextDouble();
        }

        double media = (nota1 + nota2) /2;
        System.out.printf("media = %.2f\n", media);
    }
}

