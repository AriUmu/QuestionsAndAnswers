package comporator;

import java.util.Random;

public class Message implements Comparable<Message> {
  private String message;
  private int id;

  public Message(String message) {
    this.message = message;
    this.id = new Random().nextInt(1000);
  }
  public String getMessage() {
    return message;
  }
  public Integer getId() {
    return id;
  }
  public String toString() {
    return "[" + id + "] " + message;
  }

  @Override
  public int compareTo(Message other) {
    return message.compareTo(other.getMessage());
  }

}
