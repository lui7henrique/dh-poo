public class People {
  private String name;
  private String birthDate;
  private String biography;

  public People(String name, String birthDate, String biography) {
    this.name = name;
    this.birthDate = birthDate;
    this.biography = biography;
  }

  // getters
  public String getName() {
    return this.name;
  }

  public String toString() {
    return "Name: " + this.name + " | " +
        "Birth Date: " + this.birthDate + " | " +
        "Biography: " + this.biography + " | ";
  }
}
