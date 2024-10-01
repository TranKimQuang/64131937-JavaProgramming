package Creational.FactoryMethod.Ex1;

public class PizzaHaiSan extends Pizza {
  @Override
  public void prepare() {
    System.out.println("Prepare Pizza Hai San");
  }

  @Override
  public void bake() {
    System.out.println("Bake Pizza Hai San");
  }

  @Override
  public void cut() {
    System.out.println("Cut Pizza Hai San");

  }

  @Override
  public void box() {
    System.out.println("Box Pizza Hai San");

  }
}
