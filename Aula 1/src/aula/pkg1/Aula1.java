package aula.pkg1;
import javax.swing.JOptionPane;
public class Aula1 {
    
    public static double calcular(double peso, double altura){
        return  peso/(altura*altura); 
    }
    public static void verificar(double peso, double altura, String nome, String sobreNome){
        
        double imc = calcular(peso, altura);
        
        if( imc <18.5 ){
            JOptionPane.showMessageDialog(null, "Olá, " + nome + " " + sobreNome + "! Seu IMC é de " + imc + "Você está abaixo do peso!");
        }
        if(imc >= 18.5 & imc <= 24.9){
            JOptionPane.showMessageDialog(null, "Olá, " + nome + " " + sobreNome + "! Seu IMC é de " + imc + "Você está com o peso normal!");
        }
        if(imc >= 25.0 & imc <= 29.9){
            JOptionPane.showMessageDialog(null, "Olá, " + nome + " " + sobreNome + "! Seu IMC é de " + imc + "Você está com o sobrepeso!");
        }
        if(imc >= 30.0 & imc <= 34.9){
            JOptionPane.showMessageDialog(null, "Olá, " + nome + " " + sobreNome + "! Seu IMC é de " + imc + "Você está obeso(Grau 1)!");
        }
        if(imc >= 35.0 & imc <= 39.9){
            JOptionPane.showMessageDialog(null, "Olá, " + nome + " " + sobreNome + "! Seu IMC é de " + imc + "Você está obeso(Grau 2)!");
        }
        if(imc >= 40.0){
            JOptionPane.showMessageDialog(null, "Olá, " + nome + " " + sobreNome + "! Seu IMC é de " + imc + "Você está obeso(Grau 3)!");
        }
        
    }

    public static void main(String[] args) {
        
        String  nome      = JOptionPane.showInputDialog("Primeiro Nome");
        String  sobreNome = JOptionPane.showInputDialog("Sobrenome");
        
        int     idade   =  Integer.parseInt(JOptionPane.showInputDialog("Sua idade:"));
        
        double  peso    =  Double.parseDouble(JOptionPane.showInputDialog("Seu Peso em Kg:"));
        double  altura  = Double.parseDouble(JOptionPane.showInputDialog("Seu Altura em M:"));
        
        verificar(peso, altura, nome, sobreNome);
    }
}
