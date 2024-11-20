package Questoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void numeroPerfeito(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos números você gostaria de conferir? ");
        int numDeCasos = entrada.nextInt();

        for (int x = 0; x < numDeCasos; x++){
            System.out.print("Digite um número:  ");
            int num = entrada.nextInt();

            ArrayList<Integer> divisores = new ArrayList();

            for(int i = 1; i<num; i++){
                if (num%i == 0){
                    divisores.add(i);
                }
            }

            if (divisores.stream().mapToInt(Integer::intValue).sum() == num){
                System.out.println(num + " é perfeito");
            }
            else {
                System.out.println(num + " não é perfeito");
            }
        }


    }
}
