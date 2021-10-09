import javax.swing.*;
import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[5];
        pessoas[0] = new Pessoa("Fabio",-1);
        pessoas[1] = new Pessoa("Jose",45);
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Coloque a idade"));
        JOptionPane.showMessageDialog(null, "sua idade e " + idade);

        for(Pessoa pessoa:pessoas) {
            try {
                String mostraInfo = "Nome: " + pessoa.nome + " e idade: " + pessoa.idade;
                JOptionPane.showMessageDialog(null,mostraInfo);
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        }
        System.out.println("Chegou aqui");
        try {
            System.out.println("5/0: " + 5/0);
        } catch (ArithmeticException e) {
            System.out.println("Nao e possivel dividir por 0");
        }
        try {
            pessoas[10].idade = 43;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Vai entrar aqui de qualquer jeito");
        }

        for (int i = 0; i < 7; i++) {
            try {
                JOptionPane.showMessageDialog(null,pessoas[i].nome);
            } catch (NullPointerException e) {
                System.out.println("Posicao nao instanciada");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posicao fora do tamanho do array");
            }

        }


    }
}
