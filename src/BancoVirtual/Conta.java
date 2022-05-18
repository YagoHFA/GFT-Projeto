package BancoVirtual;
public abstract class Conta implements IConta {
    private static int AGENCIA_Padrão =1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numConta;
    protected double saldo;

    public Conta() {
        int agencia = Conta.AGENCIA_Padrão;

this.numConta = SEQUENCIAL++;

    }
    @Override
    public void sacar(double valor) {
saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
this.sacar(valor);
contaDestino.depositar(valor);
    }



    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }
}