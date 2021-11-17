// Crie uma classe de Teste com o método main. Nesta classe, crie um assistente administrativo e um técnico e mostre os dados de cada um dos funcionários.

public class Main {
  public static void main(String[] args) {
    Assistente assistente1 = new Assistente("Antonio", 5000.00, 123);
    System.out.println(assistente1.ganhoAnual());
    assistente1.addAumento(1000.0);
    System.out.println(assistente1.ganhoAnual());
    System.out.println(assistente1.exibeDados());

    Tecnico tecnico1 = new Tecnico("Paulinho", 2500.00);
    System.out.println(tecnico1.ganhoAnual());
    tecnico1.addAumento(1000.0);
    System.out.println(tecnico1.ganhoAnual());
    System.out.println(tecnico1.exibeDados());
  }
}
