public class Professor extends Pessoa implements AcessoPortal {
    private String disciplina;
    private double salario;

    @Override
    public void apresentar() {
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

    @Override
    public void validaAcesso() {
        System.out.println("Acesso Validado");
    }
}
