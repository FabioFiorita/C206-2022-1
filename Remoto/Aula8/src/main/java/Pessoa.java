public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected String corDoCabelo;

    public abstract void apresentar();

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
