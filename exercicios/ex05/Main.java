import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o número de litros vendidos: ");
    int litros = sc.nextInt();
    System.out.println("Digite o tipo de combustível (A-alcool, G-gasolina): ");
    char tipo = sc.next().toUpperCase().charAt(0);
    double valor = 0;

    if (tipo == 'A') {
      if (litros <= 20) {
        valor = litros * 1.90;
      } else {
        valor = litros * 1.90 - (litros - 20) * 1.90 * 0.05;
      }
    } else {
      if (litros <= 20) {
        valor = litros * 2.50;
      } else {
        valor = litros * 2.50 - (litros - 20) * 2.50 * 0.06;
      }
    }
    System.out.println("O valor a ser pago pelo cliente é: R$ " + valor);
  }
}
