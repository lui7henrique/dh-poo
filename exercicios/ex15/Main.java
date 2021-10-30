// Faça um Programa que pergunte quanto você ganha por hora e o número
// de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
// referido mês

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Quanto você ganha por hora? ");
    double valorHora = input.nextDouble();

    System.out.print("Quantas horas você trabalha por mês? ");
    double horasTrabalhadas = input.nextDouble();

    double salario = valorHora * horasTrabalhadas;

    System.out.printf("Seu salário é de R$ %.2f", salario);
  }

}