public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected String corDoCabelo;

    public void apresentar() {
        System.out.println("Eu me chamo " + nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
