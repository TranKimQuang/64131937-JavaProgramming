package Handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import Utils.DBUtils;
import Handler.LoginHandler;

public class DemoLogin {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập tên đăng nhập: ");
    String username = scanner.nextLine();

    System.out.print("Nhập mật khẩu: ");
    String password = scanner.nextLine();

    if (LoginHandler.authenticate(username, password)) {
      System.out.println("Đăng nhập thành công!");
      // Sau khi đăng nhập thành công, bạn có thể chuyển đến màn hình chính hoặc các chức năng khác.
    } else {
      System.out.println("Sai tên đăng nhập hoặc mật khẩu.");
    }

    scanner.close();
  }
}

