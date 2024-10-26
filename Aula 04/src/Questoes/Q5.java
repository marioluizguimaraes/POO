package Questoes;
import java.util.Random;
import java.util.Scanner;

public class Q5 {

    public static void gerador(){
        for (int i = 0; i <100; i++){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(100);
            System.out.println(num);
        }
    }
    public static void maiorPosicao(){
        int[] numeros = new int[100];
        int maior = 0;
        int index = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <100; i++){
            numeros[i] = sc.nextInt();

            if (numeros[i] > maior){
                maior = numeros[i];
                index = i;
            }
        }

        System.out.println(maior);
        System.out.println(index+1);
    }
}
