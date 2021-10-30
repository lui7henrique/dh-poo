// O Departamento Estadual de Meteorologia lhe contratou para
// desenvolver um programa que leia um conjunto indeterminado de
// temperaturas, e informe ao final a menor e a maior temperaturas
// informadas, bem como a média das temperaturas.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int temp, maior = 0, menor = 0, cont = 0;
    double media = 0;

    System.out.println("Digite as temperaturas: ");
    System.out.println("(Digite qualquer palavra ou letra para cancelar) ");
    while (input.hasNextInt()) {
      temp = input.nextInt();
      if (cont == 0) {
        maior = temp;
        menor = temp;
      }
      if (temp > maior) {
        maior = temp;
      }
      if (temp < menor) {
        menor = temp;
      }
      media += temp;
      cont++;
    }
    media /= cont;
    System.out.println("Maior temperatura: " + maior);
    System.out.println("Menor temperatura: " + menor);
    System.out.println("Média das temperaturas: " + media);
  }
}