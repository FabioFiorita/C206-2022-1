public class Disciplina {
    String professor;
    String sigla;
    String nome;
    Aluno[] alunos;

    Disciplina(String professor, String sigla, String nome) {
        this.professor = professor;
        this.sigla = sigla;
        this.nome = nome;
    }

    void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Sigla: " + sigla);
        System.out.println("Professor: " + professor);
        System.out.println("Alunos matriculados: ");
        for (int i = 0; i < alunos.length; i++) {
            alunos[i].mostraInfo();
        }
    }

}
