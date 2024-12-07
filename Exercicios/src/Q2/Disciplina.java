package Q2;

public class Disciplina {
    private String nome;
    private int[] notas;
    private boolean aprovado;
    private int mediaParcial;
    private int mediafinal;

    public Disciplina(String nome, int nota1, int nota2, int notaFinal){
        this.notas = new int[3];
        this.nome = nome;
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = notaFinal;
    }

    public Disciplina(String nome, int nota1, int nota2){
        this.notas = new int[3];
        this.nome = nome;
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = -1;
    }
    public Disciplina(String nome, int nota1){
        this.notas = new int[3];
        this.nome = nome;
        this.notas[0] = nota1;
        this.notas[1] = -1;
        this.notas[2] = -1;
    }
    public Disciplina(String nome){
        this.notas = new int[3];
        this.nome = nome;
        this.notas[0] = -1;
        this.notas[1] = -1;
        this.notas[2] = -1;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNota(int bimestre, int nota){
        this.notas[bimestre-1] = nota;
    }

    private void setAprovado(boolean status){
        this.aprovado = status;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNota(int bimeste){
        return this.notas[bimeste-1];
    }

    public boolean getAprovado(){
        this.setAprovado(this.getMediaParcial()>=60 || this.getMediafinal()>=60);
        return this.aprovado;
    }

    public int getMediaParcial(){
        if (this.notas[0] > -1 && this.notas[1] > -1){
            this.mediaParcial = (this.notas[0]*2 + this.notas[1]*3)/5;
            return this.mediaParcial;
        }
        else{
            System.out.println("ATENÇÃO: o resultado não é válido, pois uma nota ainda não foi cadastrada!");
            this.mediaParcial = (this.notas[0]*2 + this.notas[1]*3)/5;
            return this.mediaParcial;
        }
    }

    public int getMediafinal(){
        if(this.getMediaParcial() >= 60){
            return this.mediaParcial;
        }
        else if (this.notas[2] == -1){
            System.out.println("ATENÇÃO: o resultado não é válido, pois a nota final ainda não foi cadastrada!");
            this.mediafinal = (this.notas[0] + this.notas[1] + this.notas[2])/3;
            return this.mediafinal;
        }
        else{
            this.mediafinal = (this.notas[0] + this.notas[1] + this.notas[2])/3;
            return this.mediafinal;
        }
    }
}
