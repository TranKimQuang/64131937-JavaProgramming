package StrateryPattern.Duck;

public class VitQuay extends Duck {
  @Override
  public void display() {
    System.out.println("VitQuay BacKi");
    this.performFly();
    this.swim();
    this.performQuack();
  }
}
