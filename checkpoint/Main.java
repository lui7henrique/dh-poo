import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws ProgramException {
    System.out.println("hello");

    // movies
    Movie avengers_end_game = new Movie("Avengers: End Game", "25/11/2019",
        "Super-heroes", 10, 2);
    avengers_end_game.like();
    System.out.println(avengers_end_game.toString());

    Movie avengers_infinity_war = new Movie("Avengers: Infinity War",
        "26/05/2018", "Super-heroes", 9, 1.7);
    avengers_infinity_war.like();
    System.out.println(avengers_infinity_war.toString());

    Movie avengers_age_of_ultron = new Movie("Avengers: Age of Ultron",
        "01/05/2015", "Super-heroes", 5, 1.5);
    avengers_age_of_ultron.dislike();
    System.out.println(avengers_age_of_ultron.toString());

    // series
    Serie wanda_vision = new Serie("Wanda Vision", "01/01/2019", "super-heroes",
        10, 1);
    wanda_vision.like();
    System.out.println(wanda_vision.toString());

    // people
    Actor tom_holland = new Actor("Tom Holland", "01/06/1996",
        "Thomas Stanley Tom Holland is a British actor, dancer and voice actor. He is best known for playing Peter Parker / Spider-Man in the Marvel Cinematic Universe.",
        "Homem Aranha: No way home");
    System.out.println(tom_holland.toString());

    Director tim_burton = new Director("Tim Burton", "25/08/1958",
        "Timothy Walter Burton is an American filmmaker, producer, screenwriter, writer, animator and designer.",
        "The Corpse Bride");
    System.out.println(tim_burton.toString());

  }
}