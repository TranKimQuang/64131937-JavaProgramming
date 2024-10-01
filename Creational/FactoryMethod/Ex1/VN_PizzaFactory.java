package Creational.FactoryMethod.Ex1;

public class VN_PizzaFactory extends PizzaStore{
  @Override
  public Pizza createPizza(PizzaType type) {
    switch (type){
      case DUA -> {
        return new PizzaM();
      }
    }
    return null;
  }
}
