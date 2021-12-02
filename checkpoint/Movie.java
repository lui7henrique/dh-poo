public class Movie extends Program {
  private double duration; // in hours

  public Movie(String name, String releaseDate, String genre, int rating, double duration) throws ProgramException {
    super(name, releaseDate, genre, rating);
    this.duration = duration;
  }

  public double getDuration() {
    return this.duration;
  }

  @Override
  public String toString() {
    return super.toString() + "Duration: " + this.duration + " hours";
  }

}