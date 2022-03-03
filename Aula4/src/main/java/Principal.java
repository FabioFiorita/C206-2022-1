public class Principal {
    public static void main(String[] args) {
        //Criando um Array de Contas
        Conta[] contas = new Conta[4];

        //Instanciando duas contas
        Conta c1 = new Conta(1234,300);
        Conta c2 = new Conta(5678,200);

        //Atribuindo as contas criadas às posições do array
        contas[0] = c1;
        contas[1] = c2;

        //É possivel instaciar o objeto direto no Array
        contas[2] = new Conta(2222,900);
        contas[3] = new Conta(1111,600);
        //ArrayIndexOutOfBoundsException
        contas[4] = new Conta(3333,650.50);

        //Acessando as informações dos objetos do array
        System.out.println("Numero: " + contas[0].numero);
        System.out.println("Saldo: " + contas[0].saldo);
        System.out.println("Numero: " + contas[1].numero);
        System.out.println("Saldo: " + contas[1].saldo);

        //Acessando as informações através de um For
        for (int i = 0; i < contas.length; i++) {
            System.out.println(contas[i].numero);
        }

        //Null Pointer Exception
        for (int i = 0; i < 5; i++) {
            System.out.println(contas[i].numero);
        }

        //Para solucionar o Null Pointer Exception:
        //Verificar se a posição do array não é nula:
        for (int i = 0; i < contas.length; i++) {
            if(contas[i] != null) {
                System.out.println(contas[i].numero);
                System.out.println(contas[i].saldo);
            }
        }

        for (int i = 0; i < contas.length; i++) {
            if(contas[i] != null) {
                contas[i].exibirConta();
            }
        }

    }
}
