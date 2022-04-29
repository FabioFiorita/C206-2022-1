public class Aluno implements Comparable<Aluno> {
    public String nome;
    public int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

//    @Override
//    public int compareTo(Aluno o) {
//        return nome.compareTo(o.nome);
//    }

    @Override
    public int compareTo(Aluno o) {
        return Integer.compare(this.matricula, o.matricula);
    }
}
