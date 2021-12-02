public class Serie extends Program {
  private int seasons;

  public Serie(String name, String releaseDate, String genre, int rating, int seasons) throws ProgramException {
    super(name, releaseDate, genre, rating);
    this.seasons = seasons;
  }

  public int getSeasons() {
    return this.seasons;
  }

  @Override
  public String toString() {
    return super.toString() + "Seasons: " + this.seasons;
  }

}