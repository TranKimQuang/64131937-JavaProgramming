package Creational.FactoryMethod.Ex1;

public class Main {
  public static void main(String[] args) {
    PizzaStore vnPizzaFactory = new VN_PizzaFactory();
    vnPizzaFactory.orderPizza(PizzaType.DUA);


  }
}
