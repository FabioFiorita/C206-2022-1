public class Estagiario extends Funcionario {
    public Estagiario(String nome, int horasTrabalhadas, double salarioHora, int matricula) {
        super(nome, horasTrabalhadas, salarioHora, matricula);
    }

    public void fazCafe() {
        System.out.println("Fazendo cafe");
    }
}
