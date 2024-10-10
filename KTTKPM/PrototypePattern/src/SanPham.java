import java.util.Objects;

public class SanPham extends Prototype {
  public String name, ID;
  public int quantity;
  public double price;

  // Constructor
  public SanPham(String name, String ID, int quantity, double price) {
    this.name = name;
    this.ID = ID;
    this.quantity = quantity;
    this.price = price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, quantity, price);
  }

  @Override
  public SanPham clone() {
    return (SanPham) super.clone();
  }

  public SanPham copy() {
    return (SanPham) super.copy();
  }


  @Override
  public String toString() {
    return "SanPham{" +
        "name='" + name + '\'' +
        ", ID='" + ID + '\'' +
        ", quantity=" + quantity +
        ", price=" + price +
        '}';
  }
}
