public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Fabio",22,1.73);
        p1.nome = "Fabio";
        p1.altura = 1.73;
        p1.idade = 22;

        Pessoa p2 = new Pessoa("Fabio",22,1.73);
        p2 = p1;
        if(p1 == p2) {
            System.out.println("Sao iguais");
        } else {
            System.out.println("Sao diferentes");
        }
        Bolo b1 = new Bolo();
        Confeitero c1 = new Confeitero();
        b1.confeiro = c1;
        Corpo corpo1 = new Corpo();
        Pessoa p3 = new Pessoa();
    }
}
