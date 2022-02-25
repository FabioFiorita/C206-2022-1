public class Departamento {
    String nome;
    double custoDeManuntencao;
    Professor professor;

    Departamento(String nome, double custoDeManuntencao) {
        this.nome = nome;
        this.custoDeManuntencao = custoDeManuntencao;
    }

    Departamento() {

    }

    Departamento(String nome) {
        this.nome = nome;
    }

    void fazerObra(double valor) {
        custoDeManuntencao += valor;
    }
}
