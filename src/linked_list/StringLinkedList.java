package linked_list;


public class StringLinkedList { //дз - вместо экземпляра класса хранить значения в массиве

  private Node first; //null
  private Node last;

  private int size;

  public  void add(String value){
    Node node = new Node(value, null);

    if(first == null) {
      first = node;
    }

    else {
      last.next = node;
    }

    last = node;
    size++;
  }

  @Override
  public String toString() {
    String result = "[";
    if(first != null){
      result += first.value;
      Node current = first.next;

      while (current != null) {
        result += ", " + current.value;
        current = current.next;
      }
    }
    result += "]";
    return result;
  }

  public boolean remove (String value){
    boolean result = false;
    Node current = first;
    Node prev = null;
    while (current != null){
      if(current.value.equals(value)){

        if (prev == null){
          first = current.next;
        } else {
          prev.next = current.next;
        }
        size --;
        result = true;
        break;
      }
      prev = current;
      current = current.next;
    }
    if(first == null){
      last = null;
    }
    return result;
  }

}
