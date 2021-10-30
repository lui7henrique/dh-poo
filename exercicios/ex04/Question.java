
/**
 * Question
 */

import java.util.Scanner;

public class Question {
  private String question;
  private String answer;

  public Question(String question) {
    this.question = question;
    this.answer = "nothing";
  }

  // getters
  public String getQuestion() {
    return this.question;
  }

  public String getAnswer() {
    return this.answer;
  }

  // setters
  public void setQuestion(String name) {
    this.question = name;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public void ask() {
    Scanner input = new Scanner(System.in);
    System.out.println(this.question);
    String answer = input.nextLine().toLowerCase();
    setAnswer(answer);
  }
}