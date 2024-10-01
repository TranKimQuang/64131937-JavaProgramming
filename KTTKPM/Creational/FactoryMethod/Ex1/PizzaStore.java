package Creational.FactoryMethod.Ex1;

public abstract class PizzaStore {
  protected abstract Pizza createPizza(PizzaType type);
  public Pizza orderPizza(PizzaType type){
    Pizza pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
  return pizza;
  }
}
