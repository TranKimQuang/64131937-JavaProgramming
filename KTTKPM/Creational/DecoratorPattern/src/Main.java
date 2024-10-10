public class Main {
  public static void main(String[] args) {
    Beverage666 b = new HouseBlend("Ca phe den");
    b = new Topping("Thach rau cau",b);
    System.out.println(b.getDescription());
    System.out.println(b.cost());
    b = new Topping("trung ga",b);
  }
}