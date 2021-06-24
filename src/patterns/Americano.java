package patterns;

public class Americano extends Coffee {
  @Override
  public void makeCoffee() {
    System.out.println("Мы сделали американо");
  }

  @Override
  public void coffeeName() {
    System.out.println("Американо");
  }

  public void addMilk(){

  }
}
