public class Aluno{
    private int matricula;
    private String nome;
    private float nota1;
    private float nota2;
    private float trab;

    //contructor
    public Aluno(int mat, String nome, float nota1, float nota2, float trab){
        this.matricula = mat;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trab = trab;
    }
    public Aluno(){

    }
    // metodos
    public float media(){
        float media;
        float i = (this.nota1 * 2.5f) + (this.nota2 * 2.5f) + (this.trab * 2);
		media = i / 7;
        return media;
    }
    public void mediaFinal(){
        float media = media();
        if(media >= 7)
            System.out.println("Passou direto");
        else{
            if(media >= 6)
                System.out.println("Precisa de 4");
            else{
                float resultado = ((media - 10) * -1);
                if(media < 4)
                    System.out.println("Reprovado");
                else
                    System.out.println("Voce precisa de " + resultado + " para passar.");
            }
        }
    }
    public String toString(){
        return "Nome: " + this.nome + "\nMatricula: " + this.matricula + "\nNota1: "+ this.nota1 + "\nNota2: "+ this.nota2 + "\nTrabalho: " + this.trab;
    }
    // Geters
    public int getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public float getNota1(){
        return this.nota1;
    }

    public float getNota2(){
        return this.nota2;
    }

    public float getTrab(){
        return this.trab;
    }
    // Setters
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNota1(float nota1){
        this.nota1 = nota1;
    }

    public void setNota2(float nota2){
        this.nota2 = nota2;
    }

    public void setTrab(float trab){
        this.trab = trab;
    }
}
