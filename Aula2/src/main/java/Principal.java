import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Entrada de dados
        //Classe Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o Nome");
        String nome = input.nextLine();
        System.out.println("Entre com a idade");
        double idade = input.nextDouble();
        System.out.println("Entre com o curso");
        input.nextLine();
        String curso = input.nextLine();
        System.out.println("Nome: " + nome + ", idade:" + idade + ", curso: " + curso);

        int nota = 70;
        int nota2 = 65;
        if(nota >= 60 && nota2 >=  60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        // ==, !=, >, <, >=, <=
        // || (OU)
        //Operador Ternario
        String resultado = nota >= 60 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        //Scanner input = new Scanner(System.in);

        double numero1;
        double numero2;
        int op;

        boolean flag = true;

        while(flag) {

            System.out.println("Escolha uma opção:");
            System.out.println("1 - somar");
            System.out.println("2 - subtrair");
            System.out.println("3 - sair");
            System.out.println("Digite a opção");
            op = input.nextInt();

            switch(op) {
                case 1:
                    System.out.println("Entre com o numero 1:");
                    numero1 = input.nextDouble();
                    System.out.println("Entre com o numero 2:");
                    numero2 = input.nextDouble();
                    System.out.println("Soma = " + (numero1+numero2));
                    break;
                case 2:
                    System.out.println("Entre com o numero 1:");
                    numero1 = input.nextDouble();
                    System.out.println("Entre com o numero 2:");
                    numero2 = input.nextDouble();
                    System.out.println("Subtração = " + (numero1-numero2));
                    break;
                case 3:
                    System.out.println("Voce saiu!");
                    flag = false;
                    break;
                default:
                    break;
            }
        }
        input.close();
    }
}
