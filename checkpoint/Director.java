public class Director extends People {
  private String most_popular_movie_directed;;

  public Director(String name, String birthDate, String biography, String most_popular_movie_directed) {
    super(name, birthDate, biography);
    this.most_popular_movie_directed = most_popular_movie_directed;
  }

  public String getMostPopularMovieDirected() {
    return this.most_popular_movie_directed;
  }

  @Override
  public String toString() {
    return super.toString() + "Most popular movie directed: " + this.most_popular_movie_directed;
  }

}