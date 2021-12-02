import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws ProgramException {
    System.out.println("hello");

    Scanner input = new Scanner(System.in);
    System.out.println("Do you want insert a movie, serie, or people?");
    String choice = input.nextLine();

    if (choice.toLowerCase().equals("serie")) {
      System.out.println("Insert the name of serie:");
      String name = input.nextLine();

      System.out.println("Insert the release date of the movie (Ex: 18/11/2002): ");
      String releaseDate = input.nextLine();

      System.out.println("Insert the genre of the serie: ");
      String genre = input.nextLine();

      System.out.println("Insert the rating of the serie (0-10): ");
      int rating = input.nextInt();

      System.out.println("Insert the numbers of seasons: (Ex: 2): ");
      int seasons = input.nextInt();

      Serie serie = new Serie(name, releaseDate, genre, rating, seasons);
      System.out.println("Serie successfully add!");
      System.out.println(serie.toString());

    } else if (choice.toLowerCase().equals("movie")) {
      System.out.println("Insert the name of the movie:");
      String name = input.nextLine();

      System.out.println("Insert the release date of the movie (Ex: 18/11/2002): ");
      String releaseDate = input.nextLine();

      System.out.println("Insert the genre of the movie:");
      String genre = input.nextLine();

      System.out.println("Insert the rating of the movie (0-10):");
      int rating = input.nextInt();

      System.out.println("Insert the duration of the movie in hours (Ex: 1,3):");
      double duration = input.nextDouble();

      Movie movie = new Movie(name, releaseDate, genre, rating, duration);
      System.out.println("Movie successfully add!");
      System.out.println(movie.toString());

    } else if (choice.toLowerCase().equals("people")) {
      System.out.println("Do you want insert a director or actor?");
      String new_choice = input.nextLine();

      if (new_choice.toLowerCase().equals("director")) {
        System.out.println("Insert the name of the director:");
        String name = input.nextLine();

        System.out.println("Insert the birth date of the director (Ex: 18/11/2002): ");
        String birthDate = input.nextLine();

      } else if (new_choice.toLowerCase().equals("actor")) {
        System.out.println("Insert the name of the actor:");
        String name = input.nextLine();

        System.out.println("Insert the birth date of the actor (Ex: 18/11/2002): ");
        String birthDate = input.nextLine();

      } else {
        input.close();
        throw new ProgramException("Invalid choice");
      }

    } else {
      input.close();
      throw new ProgramException("Invalid choice");
    }

    input.close();

    // // movies
    // Movie avengers_end_game = new Movie("Avengers: End Game", "25/11/2019",
    // "Super-heroes", 10, 2);
    // avengers_end_game.like();
    // System.out.println(avengers_end_game.toString());

    // Movie avengers_infinity_war = new Movie("Avengers: Infinity War",
    // "26/05/2018", "Super-heroes", 9, 1.7);
    // avengers_infinity_war.like();
    // System.out.println(avengers_infinity_war.toString());

    // Movie avengers_age_of_ultron = new Movie("Avengers: Age of Ultron",
    // "01/05/2015", "Super-heroes", 5, 1.5);
    // avengers_age_of_ultron.dislike();
    // System.out.println(avengers_age_of_ultron.toString());

    // // series
    // Serie wanda_vision = new Serie("Wanda Vision", "01/01/2019", "Super-heroes",
    // 10, 1);
    // wanda_vision.like();
    // System.out.println(wanda_vision.toString());

  }
}