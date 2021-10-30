// .Faça um programa que peça uma nota, entre zero e dez. Mostre uma
// mensagem caso o valor seja inválido e continue pedindo até que o
// usuário informe um valor válido.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int nota;

    do {
      System.out.print("Digite uma nota entre 0 e 10: ");
      nota = input.nextInt();
    } while (nota < 0 || nota > 10);

    System.out.println("Nota válida!");
  }
}