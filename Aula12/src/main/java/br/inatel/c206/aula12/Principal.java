package br.inatel.c206.aula12;

import br.inatel.c206.aula12.control.Arquivo;
import br.inatel.c206.aula12.model.Aluno;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        br.inatel.c206.aula12.model.Aluno a1 = new br.inatel.c206.aula12.model.Aluno();
        Aluno a2 = new Aluno();
        a1.nome = "Joao";
        a1.matricula = 1234;
        a1.curso = "GES";
        a2.nome = "Felipe";
        a2.matricula = 5678;
        a2.curso = "GEC";

        Arquivo arquivo = new Arquivo();
        arquivo.escrever(a1);
        arquivo.escrever(a2);

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos = arquivo.ler();

        for(Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Matricula: " + aluno.matricula);
            System.out.println("Curso: " + aluno.curso);
        }

    }
}
