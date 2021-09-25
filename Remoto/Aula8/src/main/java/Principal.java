public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.validaAcesso();
        Professor p1 = new Professor();
        p1.validaAcesso();
        Visitante v1 = new Visitante();
        v1.apresentar();
    }
}
