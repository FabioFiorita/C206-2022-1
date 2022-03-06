public class Curso {
    String nome;
    String tipo;
    String turno;
    Disciplina[] disciplinas;

    Curso(String nome, String tipo, String turno) {
        this.nome = nome;
        this.tipo = tipo;
        this.turno = turno;
    }

    void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Turno: " + turno);
        System.out.println("Disciplinas:");
        for (int i = 0; i < disciplinas.length; i++) {
            disciplinas[i].mostraInfo();
            System.out.println("---------------------");
        }
        System.out.println("-------------------------");
    }
}
