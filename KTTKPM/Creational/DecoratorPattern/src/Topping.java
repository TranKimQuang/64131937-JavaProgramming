public class Topping extends CondimentDeco{
  public Topping(String description, Beverage666 component) {
    super(description, component);
  }

  @Override
  public int cost() {
    return super.cost()+15;
  }
}
