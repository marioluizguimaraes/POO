package Questoes;

public class Q1 {
    public static void diasDaSemana(int dia){

        String nomeDoDia;
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        if(dia <= 7 && dia > 0){
            nomeDoDia = dias[dia-1];
        }
        else {
            nomeDoDia = "Data Invalida";
        }
        System.out.println(nomeDoDia);
    }
}
