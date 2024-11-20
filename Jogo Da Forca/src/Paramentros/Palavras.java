package Paramentros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Palavras {
    ArrayList <String> listaDePalavras = new ArrayList<>();

    public Palavras(String caminhoDoArquivo){
        try (Scanner entrada = new Scanner(new File(caminhoDoArquivo))){
            while (entrada.hasNextLine()){
                listaDePalavras.add(entrada.nextLine());
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String sortearPalavra(){
        Random roleta = new Random();

        int numeroDePalavras = listaDePalavras.size();
        int sorteado = roleta.nextInt(numeroDePalavras);

        return listaDePalavras.get(sorteado);
    }

}
