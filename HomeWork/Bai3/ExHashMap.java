package HomeWork.Bai3;

import java.util.HashMap;
import java.util.Scanner;

public class ExHashMap {
  public static void main(String[] args) {
    // tao map chua username va pass
    HashMap<String, String> users = new HashMap<>();
    users.put("user1", "1");
    users.put("user2", "2");
    users.put("user3", "3");
    users.put("user4", "4");


    // Yêu cầu người dùng nhập username và password
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập username: ");
    String username = scanner.nextLine();
    System.out.print("Nhập password: ");
    String password = scanner.nextLine();

    // Kiểm tra username có tồn tại hay không
    if (!users.containsKey(username)) {
      System.out.println("Username không tồn tại");
    } else {
      // Kiểm tra password
      if (!users.get(username).equals(password)) {
        System.out.println("PASSWORD SAI");
      } else {
        System.out.println("Bạn đã login thành công");
      }
    }
  }
}

