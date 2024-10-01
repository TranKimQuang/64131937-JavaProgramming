package Creational.FactoryMethod.Ex1;

public class PizzaM extends Pizza {
  @Override
  public void prepare() {
    pizza.append("Chuan bi bot banh");

  }

  @Override
  public void bake() {
    pizza.append("Nuong banh");

  }

  @Override
  public void cut() {
    pizza.append("cat banh");

  }

  @Override
  public void box() {
    pizza.append("cho vo hop");

  }
}
