import java.util.Scanner;

// Faça um programa que faça 5 perguntas para uma pessoa sobre um
// crime. As perguntas são:
// a) "Telefonou para a vítima?"
// b) "Esteve no local do crime?"
// c) "Mora perto da vítima?"
// d) "Devia para a vítima?"
// e) "Já trabalhou com a vítima?"
// O programa deve no final emitir uma classificação sobre a participação da
// pessoa no crime. Se a pessoa responder positivamente a 2 questões ela
// deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
// como "Assassino". Caso contrário, ele será classificado como "Inocente"

public class Main {
  public static void main(String[] args) {
    Question question1 = new Question("Telefonou para a vítima?");
    Question question2 = new Question("Esteve no local do crime?");
    Question question3 = new Question("Mora perto da vítima?");
    Question question4 = new Question("Devia para a vítima?");
    Question question5 = new Question("Já trabalhou com a vítima?");

    Question[] questions = { question1, question2, question3, question4, question5 };
    int count = 0;

    System.out.println("Perguntas sobre o crime:");
    for (Question i : questions) {
      Scanner input = new Scanner(System.in);
      System.out.println(i.getQuestion());
      String answer = input.nextLine().toLowerCase();
      i.setAnswer(answer);

      if (i.getAnswer().equals("sim")) {
        count++;
      }

    }

    System.out.println("Relatório:");
    for (Question i : questions) {
      System.out.println("Pergunta: " + i.getQuestion() + "| Resposta: " + i.getAnswer());
    }

    if (count == 2) {
      System.out.println("Suspeita");
    } else if (count == 3 || count == 4) {
      System.out.println("Cúmplice");
    } else if (count == 5) {
      System.out.println("Assassino");
    } else {
      System.out.println("Inocente");
    }
  }

}