import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        // ArithemeticExeception
        try {
            System.out.println("5/0 " + 5/0);
        } catch (Exception erro) {
            //JOptionPane.showMessageDialog(null,"Erro: " + erro);
        }


        Pessoa p1 = new Pessoa("Joao", -10);
        Pessoa p2 = new Pessoa("Jose", -100);

        Pessoa[] pessoas = new Pessoa[10];
        try {
            pessoas[0] = p1;
            pessoas[1] = p2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e);
        }


        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i] != null) {
                try {
                    System.out.println("Nome: " + pessoas[i].nome);
                    System.out.println("Idade: " + pessoas[i].idade);

                } catch (Exception e) {
                    System.out.println("Erro: " + e);
                } finally {
                    System.out.println("Passou aqui");
                }
            }

        }

        System.out.println("Chegou aqui!");

    }
}
