package entidade;

public class Aluno extends Pessoa {

    private int numeroMatricula;
    private String nomeCurso;



    public Aluno(String nome, int idade, int numeroMatricula, String nomeCurso) {
        super(nome, idade);
        this.numeroMatricula = numeroMatricula;
        this.nomeCurso = nomeCurso;
    }

    public void mostraDados(){
        System.out.println("Cursando : " + nomeCurso);
    }
}
