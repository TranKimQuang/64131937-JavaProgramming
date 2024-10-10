import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    SanPham product1 = new SanPham("Product 1", "P001", 10, 99.99);
    SanPham product2 = new SanPham("Product 2", "P002", 5, 49.99);
    SanPham product3 = new SanPham("Product 3", "P003", 20, 29.99);


    List<SanPham> productList = new ArrayList<>();
    productList.add(product1);
    productList.add(product2);
    productList.add(product3);
    Order order1 = new Order("O001", "dat", productList);
    System.out.println("Order:");
    order1.display();
    Order clonedOrder = order1.clone();
    System.out.println("\nCloned Order:");
    clonedOrder.display();

    clonedOrder.setTenKH("Jane Doe");
    clonedOrder.getProducts().getFirst().setQuantity(50);
    System.out.println("\nAfter modifying the cloned order:");
    System.out.println("Original Order:");
    order1.display();
    System.out.println("Cloned Order:");
    clonedOrder.display();
    Order copiedOrder = order1.copy();
    System.out.println("\nCopied Order:");
    copiedOrder.display();
  }
}
