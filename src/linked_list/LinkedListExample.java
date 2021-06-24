package linked_list;

public class LinkedListExample {
  public static void main(String[] args) {
    StringLinkedList linkedList = new StringLinkedList();
    linkedList.add("one");
    linkedList.add("two");
    linkedList.add("three");
    linkedList.add("four");

    System.out.println(linkedList);
    System.out.println(linkedList.remove("two"));
    System.out.println(linkedList);


  }
}
