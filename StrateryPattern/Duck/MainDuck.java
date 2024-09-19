package StrateryPattern.Duck;

public class MainDuck {
  public static void main(String[] args) {
    Duck duck = new VitQuay();
    duck.setFlyBehavior(new BayTrenLua());
    duck.setQuackBehavior(new VitQuayKeu());
    duck.display();
  }
}
