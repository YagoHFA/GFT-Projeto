package BancoVirtual;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Banco implements CriarConta {
    private List<Conta> conta = new ArrayList<>();
Scanner scan = new Scanner(System.in);
Random Id = new Random();
    @Override
    public void idUsuario(int id) {
        id = Id.nextInt();
    }

    @Override
    public void Usuario(String nomeUser) {
nomeUser = scan.next();
    }

    @Override
    public void Senhs(String senhaUser) {
senhaUser = scan.next();
    }
}
