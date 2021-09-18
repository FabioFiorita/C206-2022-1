public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Dou a disciplina de " + disciplina);

    }

    public void recebeSalario() {
        System.out.println(nome + " recebeu seu salario de R$" + salario);
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
