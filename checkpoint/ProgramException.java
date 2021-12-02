public class ProgramException extends Exception {
  public ProgramException() {

  }

  public ProgramException(String message) {
    super(message);
  }

  @Override
  public String toString() {
    return "ClienteException: " + this.getMessage();
  }

}