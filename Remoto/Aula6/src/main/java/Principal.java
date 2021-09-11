public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta(4000,132,555);
        c1.depositar(500);
        System.out.println("Saldo: " + c1.getSaldo());
        c1.sacar(3000);
        System.out.println("Saldo: " + c1.getSaldo());
        c1.setDiaFatura(15);
        System.out.println("Dia da fatura: " + c1.getDiaFatura());

        Conta c2 = new Conta(5000,333,444);
        Conta c3 = new Conta(5000,333,444);
        System.out.println(c2.getContas());
    }
}
