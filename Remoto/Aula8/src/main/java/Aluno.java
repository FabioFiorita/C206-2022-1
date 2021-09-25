public class Aluno extends Pessoa implements AcessoPortal{
    private int matricula;
    private String curso;

    @Override
    public void apresentar() {
        System.out.println("Meu curso é " + curso + " e minha matricula e " + matricula);
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void validaAcesso() {
        System.out.println("Acesso Negado");
    }
}
