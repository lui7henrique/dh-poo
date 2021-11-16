public class Principal {
  public static void main(String[] args) {
    Objeto objeto = new Objeto(50, 50, 'c');
    Nave nave = new Nave(50, 50, 'e', 500, 1000);
    Asteroide asteroide = new Asteroide(50, 50, 'a', 10);

    nave.irA(10000, 10000, 'n');
    System.out.print(nave.toString());

    // asteroide.irA(50, 50, 'l');
    // System.out.print(asteroide.toString());
  }
}
