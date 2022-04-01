public class Diretor extends Funcionario implements ContrataFuncionario{

    public Diretor(String nome, int horasTrabalhadas, double salarioHora, int matricula) {
        super(nome, horasTrabalhadas, salarioHora, matricula);
    }

    @Override
    public void apresentar() {
        System.out.println("Meu nome é " + nome);
    }

    @Override
    public void criaProcessoSeletivo() {
        System.out.println("Criando processo seletivo");
    }

    @Override
    public void agendaEntrevista() {
        System.out.println("Agendando uma entervista");
    }
}
