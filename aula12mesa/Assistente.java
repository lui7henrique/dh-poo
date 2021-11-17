// Crie a classe Assistente,quetambéméumfuncionário,equepossuium número de matrícula. Sobrescreva o método exibeDados().

public class Assistente extends Funcionario {
  public int matricula;

  public Assistente(String nome, Double salario, int matricula) {
    super(nome, salario);
    this.matricula = matricula;
  }

  @Override
  public String exibeDados() {
    return this.nome + " - " + this.salario + " - " + this.matricula;
  }
}
