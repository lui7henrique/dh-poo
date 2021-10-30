// João Papo-de-Pescador, homem de bem, comprou um microcomputador
// para controlar o rendimento financeiro de seu trabalho. Toda vez que ele
// traz um peso de peixes maior que o estabelecido pelo regulamento de
// pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$4,00
// por quilo excedente. João precisa que você faça um programa que leia a
// variável peso (peso de peixes) e calcule o excesso. Gravar na variável
// excesso a quantidade de quilos além do limite e na variável multa o valor
// da multa que João deverá pagar. Imprima os dados do programa com as
// mensagens adequadas.

public class Main {
  public static void main(String[] args) {
    System.out.println(calculateExcess(100));
  }

  public static String calculateExcess(double weight) {
    if (weight > 50) {
      double overweight = weight - 50;
      double penalty = overweight * 4;

      String message = "Excess weight: " + overweight + " kg.\n" + "Fine of: R$" + penalty;
      return message;
    } else {
      return "Not overweight";
    }
  }
}
