import Paramentros.Boneco;
import Paramentros.Palavras;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int vidas = 0;
        //int acertos = 0;

        Boneco b1 = new Boneco();
        System.out.println(b1.apararecer());

        b1.perderMembro(4,2);
        System.out.println(b1.apararecer());

        /*
        System.out.println("Palavra:");

        Palavras p1 = new Palavras("C:\\Users\\20241014040032\\Documents\\POO\\Jogo Da Forca\\src\\BancoDePalavras.txt");

        String[] letras = p1.sortearPalavra().split("");
        int numDeLetras = letras.length;

        for (int i = 0; i < numDeLetras; i++){
            System.out.print("_ ");
        }
        System.out.println(" ");

        for (int i = 0; i < numDeLetras; i++){
            System.out.print(letras[i]);
        }
        */
    }
}