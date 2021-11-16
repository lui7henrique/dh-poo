public class Principal {
  public static void main(String[] args) {
    Cachorro cachorro = new Cachorro("Meg", 10);
    System.out.println(cachorro.emitirSom());

    Cavalo cavalo = new Cavalo("Pé de pano", 5);
    System.out.println(cavalo.emitirSom());

    Preguica preguica = new Preguica("Luiz Henrique", 7);
    System.out.println(preguica.emitirSom());
  }
}
