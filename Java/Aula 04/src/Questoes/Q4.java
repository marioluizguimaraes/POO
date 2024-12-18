package Questoes;
import java.util.Scanner;

public class Q4 {
    public static void tabuadaMult(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(i + " x " + num + " = " + i*num);
        }
    }
}
