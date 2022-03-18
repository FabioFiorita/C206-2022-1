public class Conta {
    private static int numero;
    private double saldo;
    private int agencia;
    private int diaFatura;

    public Conta() {
        numero++;
    }

    public Conta(double saldo) {
        this();
        this.saldo = saldo;
    }
    void sacar(double valor) {
        if (valor <= saldo)
            saldo -= valor;
    }

    void depositar(double valor) {
        saldo += valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getDiaFatura() {
        return diaFatura;
    }

    public void setDiaFatura(int diaFatura) {
        this.diaFatura = diaFatura;
    }
}
