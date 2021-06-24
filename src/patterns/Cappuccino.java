package patterns;

public class Cappuccino extends Coffee {

  @Override
  public void makeCoffee() {
    System.out.println("Мы сделали капучино");
  }

  @Override
  public void coffeeName() {
    System.out.println("Капучино");
  }

  @Override
  protected void grindCoffee() {
    //super.grindCoffee();
  }


}
