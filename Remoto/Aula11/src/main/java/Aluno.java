public class Aluno implements Comparable<Aluno> {
    public String nome;
    public int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

//    @Override
//    public int compareTo(Aluno a) {
//        return nome.compareTo(a.nome);
//    }

    @Override
    public int compareTo(Aluno a) {
        return Integer.compare(this.matricula,a.matricula);
    }
}
