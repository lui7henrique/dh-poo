public class Main {
  public static void main(String[] args) {
    Client client1 = new Client(123, "John");
    Client client2 = new Client(456, "Mary");
    Client client3 = new Client(789, "Peter");
    Client client4 = new Client(101112, "John");

    client1.increaseDebt(500);
    client1.payDebt(250);
  }
}
