package nested_class;

public class Person {
  private String name;
  private Address address;

  public Person() {
  }

  public Person(String name, String address) {
    this.name = name;
    this.address = new Address(address);
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", address=" + address +
            '}';
  }

  /*
  Внутренний класс
   */
  private class Address {
    private String city;
    private String street;
    private String building;

    public Address(String longConfig) {
      String[] addr = longConfig.split(",");
      this.city = addr[0];
      this.street = addr[1];
      this.building = addr[2];
    }

    @Override
    public String toString() {
      return "Address{" +
              "city='" + city + '\'' +
              ", street='" + street + '\'' +
              ", building='" + building + '\'' +
              '}';
    }
  }
}
