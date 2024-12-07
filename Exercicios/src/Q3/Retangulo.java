package Q3;

public class Retangulo {
    private double altura;
    private double base;

    public Retangulo (double h, double b){
        this.setAltura(h);
        this.setBase(b);
    }

    public void setAltura(double h){
        this.altura = h;
    }

    public void setBase(double b){
        this.base = b;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getBase(){
        return this.base;
    }

    public double calcArea(){
        return this.getAltura()*this.getBase();
    }
    public double calcDiagonal(){
        return Math.sqrt(Math.pow(this.getAltura(), 2) + Math.pow(this.getBase(), 2));
    }

    public String toString() {
        return "Retangulo: " + "Altura = " + getAltura() + ", Base = " + getBase() + ", Area = " + calcArea() + ", Diagonal = " + calcDiagonal() ;
    }

}
