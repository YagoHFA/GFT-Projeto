package BancoVirtual;

public class Cliente extends Banco{
    protected int Agencia;
    protected int numConta;
    protected int  idUsuario;
    protected String nome;

    public int getAgencia() {
        return Agencia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
