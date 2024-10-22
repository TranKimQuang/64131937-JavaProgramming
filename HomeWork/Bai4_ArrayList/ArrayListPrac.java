package HomeWork.Bai4;
import java.util.ArrayList;

public class ArrayListPrac {
  public static void main(String[] args) {
    // Khai bao
    ArrayList<String> fruits = new ArrayList<String>();

    // them phan tu
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    // truy cap tung phan tu
    System.out.println("Phần tử thứ 2: " + fruits.get(1));

    // lay kich thuong cua arraylist
    System.out.println("Kích thước: " + fruits.size());

    // duyet qua arraylist
    System.out.println("Danh sách trái cây:");
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    // xoa phan tu
    fruits.remove("Banana");

    // Kiem tra xem phan tu co ton tai khong
    boolean check = fruits.contains("Banana");
    System.out.println(check);

    // Xóa tất cả phần tử
    fruits.clear();

    System.out.println("Kích thước sau khi xóa: " + fruits.size());


  }
}
