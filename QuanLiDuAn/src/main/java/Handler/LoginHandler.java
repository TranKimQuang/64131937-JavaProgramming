package Handler;
import Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginHandler {
  public static boolean authenticate(String tenDangNhap, String matKhau) {
    String sql = "SELECT * FROM Users WHERE username = ? AND password = ?";
    try (Connection conn = DBUtils.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
      stmt.setString(1, tenDangNhap);
      stmt.setString(2, matKhau); // Ở đây bạn nên mã hóa mật khẩu bằng MD5 hoặc bcrypt trước khi lưu
      ResultSet rs = stmt.executeQuery();
      return rs.next(); // Trả về true nếu tồn tại bản ghi
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
}

