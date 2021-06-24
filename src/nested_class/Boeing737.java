package nested_class;

public class Boeing737 {

  private int manufactureYear;
  static int maxPassengersCount = 300;

  public Boeing737(int manufactureYear) {
    this.manufactureYear = manufactureYear;
  }

  public int getManufactureYear() {
    return manufactureYear;
  }

  /*
  статический вложенный класс
   */
  public static class Drawing {

    public static int getMaxPassengersCount() {
      return maxPassengersCount;
    }
  }

}
