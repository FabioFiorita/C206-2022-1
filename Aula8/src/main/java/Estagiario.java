public class Estagiario extends Funcionario {
    public Estagiario(String nome, int horasTrabalhadas, double salarioHora, int matricula) {
        super(nome, horasTrabalhadas, salarioHora, matricula);
    }

    @Override
    public void apresentar() {
        System.out.println("Meu nome é " + nome);
    }

    public void fazCafe() {
        System.out.println("Fazendo cafe");
    }
}
