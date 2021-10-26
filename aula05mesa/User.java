/**
 * Cliente
 */
public class User {
  private String name;
  private String nickname;
  private double score;
  private int level;

  public User(String name, String nickname) {
    this.name = name;
    this.nickname = nickname;
    this.score = 0;
    this.level = 0;
  }

  public void increaseScore(double value) {
    this.score += value;
  }

  public void increaseLevel(int value) {
    this.level += value;
  }

  public void bonus(int value) {
    this.level += value;
  }

  // getters
  public String getName() {
    return this.name;
  }

  public String getNickname() {
    return this.nickname;
  }

  public double getScore() {
    return score;
  }

  public int getLevel() {
    return level;
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public void setScore(double score) {
    this.score = score;
  }

  public void setLevel(int level) {
    this.level = level;
  }
}