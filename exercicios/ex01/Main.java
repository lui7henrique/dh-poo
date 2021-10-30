// Tendo como dados de entrada a altura do usuário, construa um algoritmo
// que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 .

public class Main {
  public static void main(String[] args) {
    System.out.println(calculateIdealWeight(1.80));
  }

  public static double calculateIdealWeight(double height) {
    double idealWeight = (72.7 * height) - 58;
    return Math.round(idealWeight);
  }
}
