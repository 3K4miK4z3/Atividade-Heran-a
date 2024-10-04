package principal;
import entidade.Aluno;
import entidade.Pessoa;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual classe você deseja instanciar");
        System.out.println("1-Aluno");
        System.out.println("2-Pessoa");
        int escolha = sc.nextInt();


        if (escolha == 1){
            sc.nextLine();
            System.out.println("Digite o nome do aluno");
            String nome = sc.nextLine();
            System.out.println("Digite a idade do aluno");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Qual o curso que o aluno está cursando");
            String curso = sc.nextLine();
            System.out.println("Qual o número de matrícula desse aluno");
            int matricula = sc.nextInt();

            Aluno aluno = new Aluno(nome,idade,matricula,curso);
            aluno.mostraDados();
        }

        else {
            sc.nextLine();
            System.out.println("Qual o nome da pessoa");
            String nome = sc.nextLine();
            System.out.println("Qual a idade da pessoa");
            int idade = sc.nextInt();

            Pessoa pessoa = new Pessoa(nome, idade);
            pessoa.mostraDados();
        }

    }
}
