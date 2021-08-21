public class Pessoa {
    String nome;
    int idade;
    double altura;

    Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }
    Pessoa() {
        System.out.println("Nova pessoa");
    }
    void andar() {
        System.out.println(nome + " esta andando");
    }
    void fezAniversario() {
        idade+= 1;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
