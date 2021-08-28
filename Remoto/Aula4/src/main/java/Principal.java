public class Principal {
    public static void main(String[] args) {
        //Criando um Array de Contas
        Conta[] contas = new Conta[5];

        //Instaciando duas contas
        Conta c1 = new Conta(1234,300);
        Conta c2 = new Conta(5678,200);

        //Atribuindo as contas criadas nas posições do Array
        contas[0] = c1;
        contas[1] = c2;

        //Instanciando objetos direto no Array
        contas[2] = new Conta(2222,500);
        contas[3] = new Conta(1111,600);
        //contas[4] = new Conta(5555,333);

        // Acessando as informações dos objetos do Array
//        System.out.println("Numero: " + contas[0].numero);
//        System.out.println("Saldo: " + contas[0].saldo);
//        System.out.println("Numero: " + contas[1].numero);
//        System.out.println("Saldo: " + contas[1].saldo);

        //Acessando as informações atraves de um For
        for (int i = 0; i < contas.length; i++) {
            if(contas[i] != null) {
                contas[i].exibirConta();
            }
        }
    }
}
