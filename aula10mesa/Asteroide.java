public class Asteroide extends Objeto {
  private int danos;

  public Asteroide(int x, int y, char direcao, int danos) {
    super(x, y, direcao);
    this.danos = danos;
  }

  @Override
  public void irA(int x, int y, char direcao) {
    super.irA(x, y, direcao);
  }
}
