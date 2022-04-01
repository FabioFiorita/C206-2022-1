public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta(5000);
        c1.setDiaFatura(15);
        //c1.setNumero(1234);
        c1.setAgencia(5678);
        c1.depositar(500);
        c1.sacar(1000);
        System.out.println(c1.getNumero());
        //System.out.println(c1.getSaldo());
        Conta c2 = new Conta(4200);
        System.out.println(c2.getNumero());
        //c1.saldo = 1000000;
    }
}
