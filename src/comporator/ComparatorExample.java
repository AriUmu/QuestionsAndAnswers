package comporator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

  public static void main(String[] args) {
    List<Message> list = new ArrayList<>();
    Message message = new Message("First");
    Message message2 = new Message("Second");
    Message message3 = new Message("Third");
    Message message4 = new Message("Forth");

    list.add(message);
    list.add(message2);
    list.add(message3);
    list.add(message4);

    //Анониимный класс
   Comparator<Message> comparator = new Comparator<Message>() {
     @Override
     public int compare(Message o1, Message o2) {
       return o1.getMessage().compareTo(o2.getMessage());
     }
   };

    list.stream().sorted(comparator).forEach(System.out::println);


    System.out.println("________________");
    //сортиирует по правилу в классе Message
    list.stream().sorted().forEach(System.out::println);
  }

}

