// Sabendo que os Assistentes Técnicos possuem um bônus salarial e que os
// Assistentes Administrativos possuem um turno (dia ou noite) e um adicional
// noturno, crie as classes Tecnico e Administrativo e sobrescreva o método
// ganhoAnual() de ambas as classes.

public class Tecnico extends Funcionario {
  public Tecnico(String nome, Double salario) {
    super(nome, salario);
  }
}
