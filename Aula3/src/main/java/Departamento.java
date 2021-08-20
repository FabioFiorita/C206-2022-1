public class Departamento {
    String nome;
    double custoDeManutencao;
    Professor professor;

    void fazerObra(double valor) {
        custoDeManutencao += valor;
    }
}
