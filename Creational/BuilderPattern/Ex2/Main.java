package Creational.BuilderPattern.Ex2;

public class Main {
  public static void main(String[] args) {
    UI ui1 = new UI("UI 1");
    UI ui2 = new UI("UI 2");
    UI ui3 = new UI("UI 3");
    SanPham sp1 = new SanPham("SP001", "Sản phẩm 1", 10, 100.0);
    SanPham sp2 = new SanPham("SP002", "Sản phẩm 2", 5, 150.0);
    ui1.addSanPham(sp1);
    ui2.addSanPham(sp2);
    ui1.displaySanPhams();
    ui2.displaySanPhams();
    ui2.removeSanPham("SP002");
    ui1.displaySanPhams();
    ui2.displaySanPhams();
  }
}

