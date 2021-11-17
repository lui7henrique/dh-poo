public abstract class Funcionario {
  public String nome;
  public Double salario;

  public Funcionario(String nome, Double salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public void addAumento(Double valor) {
    this.salario = salario + valor;
  }

  public Double ganhoAnual() {
    return this.salario * 12;
  }

  public String exibeDados() {
    return this.nome + " - " + this.salario;
  }
}
