public class Nave extends Objeto {
  private double velocidade;
  private int vida;

  public Nave(int x, int y, char direcao, double velocidade, int vida) {
    super(x, y, direcao);
    this.velocidade = velocidade;
    this.vida = vida;
  }

  @Override
  public void irA(int x, int y, char direcao) {
    super.irA(x, y, direcao);
  }

  public void girar(char direcao) {
    System.out.println("girar");
  }

  public void restaVida(int valor) {
    System.out.println(this.vida);
  }

}
