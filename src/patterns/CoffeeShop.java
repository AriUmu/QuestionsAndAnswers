package patterns;

public class CoffeeShop {

  public static void main(String[] args) {
    Coffee coffee = orderCoffee(CoffeeType.AMERICANO);
    coffee.coffeeName();
  }

  public static Coffee orderCoffee(CoffeeType type) {
    Coffee coffee = null;

    switch (type) {
      case AMERICANO:
        coffee = new Americano();
        break;
      case CAPPUCCINO:
        coffee = new Cappuccino();
        break;
    }

    coffee.grindCoffee();
    coffee.makeCoffee();
    coffee.pourIntoCup();

    System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
    return coffee;
  }
}
