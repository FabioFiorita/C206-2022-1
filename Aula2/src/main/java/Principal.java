import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Variaveis Primitivas
        double pi = 3.1415;
        //Variaveis de Referencia
        String nome = "Fabio";
        //Pessoa p1;
        // Criar um comentario
        /*

         */
        //float nota;
        float media;

        double saldoContaCorrente;

        final int MATRICULA_INATEL = 1234;
        //MATRICULA_INATEL = 5678;

        double numero = 134.56;
        //numero = 32;
        int numero2 = 33;
        numero = (int) numero;
        //System.out.println(numero);

        //Entrada de dados
        //Classe Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o nome:");
        //String nome2 = input.nextLine();
        System.out.println("Entre com a idade:");
        //int idade = input.nextInt();
        System.out.println("Entre com o curso:");
        //input.nextLine();
        //String curso = input.nextLine();
        //System.out.println("Nome: " + nome2);
        //System.out.println("Idade: " + idade);
        //System.out.println("Curso: " + curso);

        // If else
        int nota = 75;
        if(nota >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        } // >,<,>=,<=, !=, ==
        int nota2 = 40;
        if(nota >= 60 || nota2 >= 60) {
            //System.out.println("Aprovado");
        } else {
            //System.out.println("Reprovado");
        }
        String resultado = (nota >= 60) ? "Aprovado" : "Reprovado";

        //Estrutura de repetição
        int i=0;
        while(i<20) {
            //System.out.println(i);
            i++;
        }

        for (int j = 0; j < 10; j++) {
            //System.out.println("Valor de j " + j);
        }

        boolean flag =  true;

        while(flag) {
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Sair");
            int op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Entre com o primeiro numero");
                    int num1 = input.nextInt();
                    System.out.println("Entre com o segundo numero");
                    int num2 = input.nextInt();
                    System.out.println("Soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Entre com o primeiro numero");
                    int num3 = input.nextInt();
                    System.out.println("Entre com o segundo numero");
                    int num4 = input.nextInt();
                    System.out.println("Soma: " + (num3 - num4));
                    break;
                case 3:
                    flag = false;
                    break;
            }

        }
        input.close();
    }
}
