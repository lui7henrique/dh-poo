public class Program {
  private String name;
  private String releaseDate;
  private String genre;
  private int rating; // 0 - 10
  private int likes;
  private int dislikes;

  public Program(
      String name,
      String releaseDate,
      String genre,
      int rating) throws ProgramException {

    if (rating <= 0 || rating > 10) {
      throw new ProgramException("Rating must be between 1 and 10");
    } else {
      this.name = name;
      this.releaseDate = releaseDate;
      this.genre = genre;
      this.rating = rating;
      this.likes = 0;
      this.dislikes = 0;
    }

  }

  // methods
  public void like() {
    this.likes++;
  }

  public void dislike() {
    this.dislikes++;
  }

  // getters
  public String getName() {
    return this.name;
  }

  public String getReleaseDate() {
    return this.releaseDate;
  }

  public String getGenre() {
    return this.genre;
  }

  public int getLikes() {
    return this.likes;
  }

  public int getDislikes() {
    return this.dislikes;
  }

  public int getRating() {
    return this.rating;
  }

  public String toString() {
    return "Name: " + this.name + " | " +
        "Release date: " + this.releaseDate + " | " +
        "Genre: " + this.genre + " | " +
        "Likes: " + this.likes + " | " +
        "Dislikes: " + this.dislikes + " | " +
        "Rating: " + this.rating + " | ";
  }
}
