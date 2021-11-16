public class Objeto {
  private int posx;
  private int posy;
  private char direcao;

  public Objeto(int posx, int posy, char direcao) {
    this.posx = posx;
    this.posy = posy;
    this.direcao = direcao;
  }

  public void irA(int x, int y, char direcao) {
    this.posx = x;
    this.posy = y;
    this.direcao = direcao;
  }

  @Override
  public String toString() {
    return "Objeto: " + posx + "," + posy + "," + direcao;
  }
}
