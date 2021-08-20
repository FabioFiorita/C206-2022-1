public class Professor {
    String nome;
    double salario;
    int matricula;

    Professor() {
        System.out.println("Novo professor!");
    }

    void darAula() {
        System.out.println(nome + " esta dando aula");
    }

    void tiraFerias(int dias) {
        System.out.println(nome + " tirou " + dias + " dias de ferias");
    }
    void tiraFerias() {
        System.out.println(nome + " tirou 30 dias de ferias");
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", matricula=" + matricula +
                '}';
    }
}
