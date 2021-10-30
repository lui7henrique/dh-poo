// Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
// qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
// número ele deseja ver a tabuada. A saída deve ser conforme o exemplo
// abaixo:

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number;

    System.out.print("Enter a number: ");
    number = input.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " x " + i + " = " + (number * i));
    }
  }
}