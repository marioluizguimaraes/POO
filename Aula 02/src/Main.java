import javax.swing.*;

public class Main {
    public static int diasNoMesSwitch2(int mes){
        int NumDias = switch(mes){
            case 1, 3, 5, 8, 7, 10, 12  -> 31;
            case 4, 6, 9, 11            -> 30;
            default                     -> 28;
        };
        return NumDias;
    }

    public static int diasNoMesSwitch1(int mes){
        switch(mes){
            case 1, 3, 5, 8, 7, 10, 12  : return 31;
            case 4, 6, 9, 11            : return 30;
            case 2                      : return 28;
            default                     : return 0;
        }
    }

    public static int diasNoMesIf(int mes){
        if (mes < 1 || mes > 12){
            return 0;
        }
        if (mes == 2){
            return 28;
        }
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            return 30;
        }
        else {
            return 0;
        }
    }


    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Escreva um Número entre 1 e 12:"));

        int dias;

        dias = diasNoMesSwitch1(mes);
        JOptionPane.showMessageDialog(null,dias);

        dias = diasNoMesSwitch2(mes);
        JOptionPane.showMessageDialog(null,dias);

        dias = diasNoMesIf(mes);
        JOptionPane.showMessageDialog(null,dias);
    }
}