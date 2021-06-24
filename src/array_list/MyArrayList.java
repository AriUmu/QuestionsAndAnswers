package array_list;


import java.util.Arrays;

/**
 * Реализациия ArrayList
 */
public class MyArrayList {

  private static final int DEFAULT_SIZE = 10;
  static int size = 0;
  private String[] elenemts = new String[DEFAULT_SIZE];

  public void add(String string) {
    if(size == elenemts.length){
      elenemts = Arrays.copyOf(elenemts, elenemts.length * 2);
    }
    elenemts[size++] = string;
  }

  @Override
  public String toString() {
    return Arrays.toString(elenemts);
  }

  public void remove(int i) {
    if(i >= size || i < 0){
      return;
    }
    //todo убрать  5й
    //0 1 2 3 "4" 5 6 7 8 9
    System.arraycopy(elenemts, i+1, elenemts, i,size-i -1);
    size--;
    elenemts[size] = null;
  }

  public String get(int i) {
    if (i > 0 && i < size){
      return elenemts[i];
    }
    return "-1";
  }

  public void set(int i, String string){
    elenemts[i] = string;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

}
