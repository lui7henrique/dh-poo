public class Cachorro extends Animal {

  public Cachorro(String nome, int idade) {
    super(nome, idade);
  }

  public String emitirSom() {
    return "AU AU AU";
  }

  public String correr() {
    return "Correndo";
  }
}
