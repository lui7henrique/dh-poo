
public class Cliente {
    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;
    private double divida;

    public Cliente(String nome, String sobrenome, String rg, String string, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limite = limite;
        this.divida = 0;
        saldoEmConta = 0;

    }

    public void comprar(double valor) throws ClienteException {
        if (saldoEmConta < valor) {
            throw new ClienteException("Saldo insuficiente");
        } else {
            saldoEmConta -= valor;
        }

        saldoEmConta += valor;
    }

    public void pagarDivida(double valor) throws ClienteException {
        if (divida <= 0) {
            throw new ClienteException("Divida inexistente");
        } else {
            saldoEmConta -= valor;
        }

    }

    public void depositar(double valor) {
        this.saldoEmConta += valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nome + ' ' +
                sobrenome + ' ' +
                ", seu saldo é=" + saldoEmConta + "R$ }";
    }
}