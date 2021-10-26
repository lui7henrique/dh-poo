/**
 * Cliente
 */
public class Client {
  private int number;
  private String name;
  private double debt;

  public Client(int number, String name) {
    this.number = number;
    this.name = name;
    this.debt = 0;
  }

  public void increaseDebt(double value) {
    this.debt += value;
    System.out.println("Your debt now is " + this.debt);
  }

  public void payDebt(double value) {
    if (this.debt == 0) {
      System.out.println("There is no debt to pay");
    } else {
      this.debt -= value;
      System.out.println("Your debt now is " + this.debt);
    }
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumber() {
    return this.number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public double getDebt() {
    return this.debt;
  }
}