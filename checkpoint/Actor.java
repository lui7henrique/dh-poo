public class Actor extends People {
  private String most_popular_movie;

  public Actor(String name, String birthDate, String biography, String most_popular_movie) {
    super(name, birthDate, biography);
    this.most_popular_movie = most_popular_movie;
  }

  public String getMostPopularMovie() {
    return this.most_popular_movie;
  }

  @Override
  public String toString() {
    return super.toString() + "Most popular movie: " + this.most_popular_movie;
  }

}