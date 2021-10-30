// Faça um programa para uma loja de tintas. O programa deverá pedir o
// tamanho em metros quadrados da área a ser pintada. Considere que a
// cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta
// é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário
// a quantidades de latas de tinta a serem compradas e o preço total.

public class Main {
  public static void main(String[] args) {
    System.out.println(calculateAmountPaintCans(270));
  }

  public static String calculateAmountPaintCans(double meters) {
    double liters = meters / 3;
    double cans = Math.ceil(liters / 18);

    String message = "Paint cains: " + Math.ceil(cans) + "\nTotal value: R$" + cans * 80;
    return message;

  }
}