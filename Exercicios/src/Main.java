import Q1.Circulo;
import Q2.Disciplina;
import Q3.Retangulo;

public class Main {
    public static void main(String[] args) {


        Circulo c1 = new Circulo(4);
        System.out.printf("Raio: %.2f\n", c1.getRaio());
        System.out.printf("Área: %.2f\n", c1.getArea());
        System.out.printf("Cicunferência: %.2f\n", c1.getCircunferencia());

        System.out.println("-------------------------------------------------");

        Disciplina m1 = new Disciplina("POO");
        m1.setNota(1, 40);
        m1.setNota(2, 40);
        m1.setNota(3,100);
        System.out.println(m1.getMediafinal());
        System.out.println(m1.getAprovado());

        Disciplina m2 = new Disciplina("POO", 100, 10);
        System.out.println(m2.getMediafinal());
        System.out.println(m2.getAprovado());

        System.out.println("-------------------------------------------------");

        Retangulo r1 = new Retangulo(5,10);
        System.out.println(r1.toString());
    }
}