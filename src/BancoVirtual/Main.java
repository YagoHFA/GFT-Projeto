package BancoVirtual;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
Conta cc = new ContaCorrente();
        Conta poupança = new ContaPoupança();

cc.depositar(scan.nextDouble());
cc.transferir(scan.nextDouble(), poupança);

cc.implimirExtrato();
poupança.implimirExtrato();
    }


}
