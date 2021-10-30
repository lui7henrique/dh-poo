import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o salário do colaborador: ");
    double salario = input.nextDouble();
    double aumento = 0;
    double novoSalario = 0;

    if (salario <= 280) {
      aumento = salario * 0.2;
      novoSalario = salario + aumento;
      System.out.println("Salário antes do reajuste: " + salario);
      System.out.println("Percentual de aumento aplicado: 20%");
      System.out.println("Valor do aumento: " + aumento);
      System.out.println("Novo salário: " + novoSalario);
    } else if (salario > 280 && salario <= 700) {
      aumento = salario * 0.15;
      novoSalario = salario + aumento;
      System.out.println("Salário antes do reajuste: " + salario);
      System.out.println("Percentual de aumento aplicado: 15%");
      System.out.println("Valor do aumento: " + aumento);
      System.out.println("Novo salário: " + novoSalario);
    } else if (salario > 700 && salario <= 1500) {
      aumento = salario * 0.1;
      novoSalario = salario + aumento;
      System.out.println("Salário antes do reajuste: " + salario);
      System.out.println("Percentual de aumento aplicado: 10%");
      System.out.println("Valor do aumento: " + aumento);
      System.out.println("Novo salário: " + novoSalario);
    } else if (salario > 1500) {
      aumento = salario * 0.05;
      novoSalario = salario + aumento;
      System.out.println("Salário antes do reajuste: " + salario);
      System.out.println("Percentual de aumento aplicado: 5%");
      System.out.println("Valor do aumento: " + aumento);
      System.out.println("Novo salário: " + novoSalario);
    }
  }
}