public class Principal {
    public static void main(String[] args) {
        Curso c1 = new Curso("GEC","Graduação","Noturno");
        Curso c2 = new Curso("GEC","Graduação","Integral");
        Curso c3 = new Curso("GES","Graduação","Noturno");

        Disciplina d1 = new Disciplina("Chris","C206","POO");
        Disciplina d2 = new Disciplina("Renzo","C012","SO");
        Disciplina d3 = new Disciplina("Soned","T202","Redes");

        Aluno a1 = new Aluno("Mario",1234,20);
        Aluno a2 = new Aluno("Jose",4542,24);
        Aluno a3 = new Aluno("Joao",4142,21);
        Aluno a4 = new Aluno("Felipe",4512,18);
        Aluno a5 = new Aluno("Pedro",4213,26);
        Aluno a6 = new Aluno("Gabriel",5342,29);
        Aluno a7 = new Aluno("Renan",5642,33);
        Aluno a8 = new Aluno("Paulo",6321,43);
        Aluno a9 = new Aluno("Gabriel",6421,19);

        c1.disciplinas = new Disciplina[3];
        c2.disciplinas = new Disciplina[2];
        c3.disciplinas = new Disciplina[2];

        d1.alunos = new Aluno[5];
        d2.alunos = new Aluno[9];
        d3.alunos = new Aluno[2];

        d1.alunos[0] = a1;
        d1.alunos[1] = a2;
        d1.alunos[2] = a3;
        d1.alunos[3] = a4;
        d1.alunos[4] = a5;

        d2.alunos[0] = a1;
        d2.alunos[1] = a2;
        d2.alunos[2] = a3;
        d2.alunos[3] = a4;
        d2.alunos[4] = a5;
        d2.alunos[5] = a6;
        d2.alunos[6] = a7;
        d2.alunos[7] = a8;
        d2.alunos[8] = a9;

        d3.alunos[0] = a1;
        d3.alunos[1] = a2;

        c1.disciplinas[0] = d1;
        c1.disciplinas[1] = d2;
        c1.disciplinas[2] = d3;

        c2.disciplinas[0] = d2;
        c2.disciplinas[1] = d3;

        c3.disciplinas[0] = d1;
        c3.disciplinas[1] = d3;

        c1.mostraInfo();
        c2.mostraInfo();
        c3.mostraInfo();
    }
}
