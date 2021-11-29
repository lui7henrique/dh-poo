public class Main {
    public static void main(String[] args) throws ClienteException {
        System.out.println("hello");
        Cliente cliente = new Cliente("Luiz Henrique", "Delfino", "123.456.789-10", "Rua do Cliente", 5000.00);

        cliente.depositar(1000);
        cliente.comprar(1000);
        // cliente.pagarDivida(50);
    }
}
