public class Main {
  public static void main(String[] args) {
    User user1 = new User("John", "John123");
    User user2 = new User("Mary", "Mary123");
    User user3 = new User("Bob", "Bob123");
    User user4 = new User("Jack", "Jack123");
    User user5 = new User("Jill", "Jill123");

    user1.setScore(500);
    user2.setScore(500);

    User[] users = { user1, user2, user3, user4, user5 };

    for (User i : users) {
      System.out.println("name: " + i.getName() + " | " + "nickname: " + i.getNickname() + " | " + "score: "
          + i.getScore() + " | " + "level: " + i.getLevel());
    }

  }
}
