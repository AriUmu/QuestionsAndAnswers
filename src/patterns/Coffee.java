package patterns;

// абстрактный класс
public  abstract class Coffee {
  protected void grindCoffee() {
    // перемалываем кофе
  }

  public void makeCoffee(){
    // делаем кофе
  }

  public void pourIntoCup() {
    // наливаем в чашку
  }

  public abstract void coffeeName();
}
