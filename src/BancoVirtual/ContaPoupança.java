package BancoVirtual;

public class ContaPoupança extends Conta {

    @Override
    public void implimirExtrato() {
        System.out.println("Extrato conta Poupança ");
        {
            imprimirInfosComuns();
        }
    }
        protected void imprimirInfosComuns(){
            System.out.println(String.format("Agencia: %d", super.agencia));
            System.out.println(String.format("Conta: %d", super.numConta));
            System.out.println(String.format("Saldo: %2f", super.saldo));
        }



    }


