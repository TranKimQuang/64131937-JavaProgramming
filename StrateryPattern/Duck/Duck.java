package StrateryPattern.Duck;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public abstract void display();

  public void performFly(){
    System.out.println(flyBehavior.fly());
  }
  public  void performQuack()
  {
    System.out.println(quackBehavior.quack());
  }
  public void swim() {
    System.out.println("rrrr.....");
  }

  public FlyBehavior getFlyBehavior() {
    return flyBehavior;
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public QuackBehavior getQuackBehavior() {
    return quackBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
