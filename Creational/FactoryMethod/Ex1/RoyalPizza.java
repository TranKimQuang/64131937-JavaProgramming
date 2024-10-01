package Creational.FactoryMethod.Ex1;

public class RoyalPizza extends PizzaStore{
  @Override
  public Pizza createPizza(PizzaType type) {
    switch (type) {
      case CHAY -> {
        return new PizzaHaiSan();
      }
    }

    return null;
  }

}
