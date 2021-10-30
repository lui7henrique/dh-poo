// 3.Dado uma string com uma frase informada pelo usuário (incluindo
// espaços em branco), conte:
// 1. quantos espaços em branco existem na frase.
// 2. quantas vezes aparecem as vogais a, e, i, o, u.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite uma frase: ");
    String frase = input.nextLine();
    int espacos = 0;
    int a = 0;
    int e = 0;
    int i = 0;
    int o = 0;
    int u = 0;

    for (int index = 0; index < frase.length(); index++) {
      if (frase.charAt(index) == ' ') {
        espacos++;
      }
      if (frase.charAt(index) == 'a' || frase.charAt(index) == 'A') {
        a++;
      }
      if (frase.charAt(index) == 'e' || frase.charAt(index) == 'E') {
        e++;
      }
      if (frase.charAt(index) == 'i' || frase.charAt(index) == 'I') {
        i++;
      }
      if (frase.charAt(index) == 'o' || frase.charAt(index) == 'O') {
        o++;
      }
      if (frase.charAt(index) == 'u' || frase.charAt(index) == 'U') {
        u++;
      }
    }
    System.out.println("Quantidade de espaços em branco: " + espacos);
    System.out.println("Quantidade de a: " + a);
    System.out.println("Quantidade de e: " + e);
    System.out.println("Quantidade de i: " + i);
    System.out.println("Quantidade de o: " + o);
    System.out.println("Quantidade de u: " + u);
  }
}