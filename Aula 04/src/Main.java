import java.util.Scanner;
import Questoes.Q2;
import Questoes.Q3;


public class Main {

    public static int ValidacaoNum1(){
        int num;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Digite um valor entre 0 e 100: ");
            num = sc.nextInt();
        } while (num < 0 || num > 100);

        System.out.println("Resposta enviada com sucesso!");
        return num;
    }

    public static void main(String[] args) {
        Q3.restoDois();
    }
}