import java.util.List;
import java.util.ArrayList;

public class Order extends Prototype {
  String id, tenKH;
  List<SanPham> products;

  public Order(String id, String tenKH, List<SanPham> products) {
    this.id = id;
    this.tenKH = tenKH;
    this.products = products;
  }

  public void setTenKH(String tenKH) {
    this.tenKH = tenKH;
  }

  public List<SanPham> getProducts() {
    return products;
  }

  @Override
  public Order copy() {
    Order copied = (Order) super.copy();
    copied.products = new ArrayList<>();
    for (SanPham product : this.products) {
      copied.products.add(product.copy());
    }
    return copied;
  }

  @Override
  public Order clone() {
    Order cloned = (Order) super.clone();
    cloned.products = new ArrayList<>();
    for (SanPham product : this.products) {
      cloned.products.add(product.clone());
    }
    return cloned;
  }

  @Override
  public String toString() {
    return "Order{" +
        "id='" + id + '\'' +
        ", tenKH='" + tenKH + '\'' +
        ", products=" + products +
        '}';
  }

  public void display() {
    System.out.println(id + " : " + tenKH);
    for (SanPham p : products) {
      System.out.println(p.toString());
    }
  }
}
