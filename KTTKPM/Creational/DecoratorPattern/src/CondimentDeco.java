public class CondimentDeco extends Beverage666{
  Beverage666 component;

  public CondimentDeco(String description, Beverage666 component) {
    super(description);
    this.component = component;
  }

  @Override
  public int cost() {
    return component.cost();
  }

  @Override
  public String getDescription() {
    return super.description + "," + this.component;
  }
}
