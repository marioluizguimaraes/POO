package Q2;

public class Disciplina {
    private String nome;
    private int[] notas;
    private boolean aprovado;


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
        this.notas[bimestre-1] = bimestre == 1 ?  nota*2 : nota*3;
    }

    public void setAprovado(boolean status){
        this.aprovado = status;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNota(int bimeste){
        return this.notas[bimeste-1];
    }

    public boolean getAprovado(){
        return this.aprovado;
    }

    public boolean aprovar(){
        if (this.notas[0] > -1 && this.notas[1] > -1){
            int media = (this.notas[0] + this.notas[1])/5;
            this.setAprovado(media >= 60);
        }
        return this.getAprovado();
    }
}
