public class Conta {
    private static int contas;
    private double saldo;
    private int agencia;
    private int numero;
    private int diaFatura;

    public Conta() {
        contas++;
    }

    public Conta(double saldo, int agencia, int numero) {
        this();
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getDiaFatura() {
        return diaFatura;
    }

    public void setDiaFatura(int diaFatura) {
        if(diaFatura > 0 && diaFatura <= 31)
            this.diaFatura = diaFatura;
    }

    public int getContas() {
        return contas;
    }
}
