import java.util.Scanner;

// Faça um programa que peça para n pessoas a sua idade, ao final o
// programa deverá verificar se a média de idade da turma varia entre 0 e
// 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou
// idosa, conforme a média calculada.

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int idade, soma = 0, cont = 0;
    double media;

    while (cont < 5) {
      System.out.print("Digite a idade: ");
      idade = input.nextInt();
      soma += idade;
      cont++;
    }

    media = soma / 5.0;

    if (media >= 0 && media <= 25) {
      System.out.println("A turma é jovem");
    } else if (media > 25 && media <= 60) {
      System.out.println("A turma é adulta");
    } else {
      System.out.println("A turma é idosa");
    }
  }
}
