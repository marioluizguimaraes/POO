package Questoes;
import java.util.Objects;
import java.util.Scanner;

public class Q3 {
    public static void criptografia(){
        System.out.println("Escreva Tudo em maiúsculo!!");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Palavra codificada: ");
        String palavra = entrada.next();
        System.out.print("\nDeslocamento: ");
        int deslocamento = entrada.nextInt();

        String[] alfabeto = {"A", "B", "C", "D","E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        String[] letras = palavra.split("");

        System.out.print("\nPalavra decodificada: ");
        for(int i = 0; i < palavra.length(); i++){

            for (int x = 0; x<alfabeto.length; x++){
                if (x - deslocamento < 0){
                    if(Objects.equals(letras[i], alfabeto[x])){
                        System.out.print((alfabeto.length - deslocamento));
                        letras[i] =  alfabeto[(alfabeto.length - deslocamento)];
                    }
                }
                else {
                    if (Objects.equals(letras[i], alfabeto[x])) {
                        letras[i] = alfabeto[x - deslocamento];
                    }
                }
            }
            System.out.print(letras[i]);
        }
    }


}
