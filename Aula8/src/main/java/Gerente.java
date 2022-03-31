public class Gerente extends Funcionario {
    private String senhaAcesso;
    private double bonus;

    public Gerente(String nome, int horasTrabalhadas, double salarioHora, int matricula, String senhaAcesso, double bonus) {
        super(nome, horasTrabalhadas, salarioHora, matricula);
        this.senhaAcesso = senhaAcesso;
        this.bonus = bonus;
    }

    @Override
    public double calculaSalarioMes() {
        double totalSalario = super.calculaSalarioMes();
        totalSalario += bonus;
        return totalSalario;
    }

    @Override
    public void apresentar() {
        //super.apresentar();
        System.out.println("Sou um gerente com senha de acesso " + senhaAcesso);
    }
}
