// Faça um programa que permita ao usuário digitar o seu nome e em
// seguida mostre o nome do usuário de trás para frente utilizando somente
// letras maiúsculas. Dica: lembre−se que ao informar o nome o usuário
// pode digitar letras maiúsculas ou minúsculas.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = input.nextLine().trim();

    String resultado = "";
    char[] ch = nome.toCharArray();
    for (int i = ch.length - 1; i >= 0; i--) {
      resultado += ch[i];
    }
    System.out.println("Nome invertido: " + resultado.trim());
  }

}