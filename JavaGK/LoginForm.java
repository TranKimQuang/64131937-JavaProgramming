import javax.swing.*;
import java.awt.event.*;

public class LoginForm {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Login");
    frame.setSize(300, 150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField usernameField = new JTextField(20);
    JPasswordField passwordField = new JPasswordField(20);
    JButton loginButton = new JButton("Login");

    loginButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Kiểm tra tên đăng nhập và mật khẩu với database
        if (authenticate(username, password)) {
          JOptionPane.showMessageDialog(frame, "Login successful!");
          // Mở màn hình chính
          mainScreen();
        } else {
          JOptionPane.showMessageDialog(frame, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });

    JPanel panel = new JPanel();
    panel.add(new JLabel("Username:"));
    panel.add(usernameField);
    panel.add(new JLabel("Password:"));
    panel.add(passwordField);
    panel.add(loginButton);

    frame.getContentPane().add(panel);
    frame.setVisible(true);
  }

  private static boolean authenticate(String username, String password) {
    // Kiểm tra tên đăng nhập và mật khẩu với database
    return "admin".equals(username) && "password".equals(password); // Thay đổi theo yêu cầu của bạn
  }

  private static void mainScreen() {
    // Mở màn hình chính
    JFrame mainFrame = new JFrame("Main Screen");
    mainFrame.setSize(400, 300);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Tạo một thể hiện của lớp Calculator
    Calculator calculator = new Calculator();

    // Thêm các chức năng xem, thêm, xóa, sửa thông tin sản phẩm
    JButton addButton = new JButton("Add Product");
    JButton editButton = new JButton("Edit Product");
    JButton deleteButton = new JButton("Delete Product");
    JButton viewButton = new JButton("View Products");
    JButton calculateButton = new JButton("Calculate");

    calculateButton.addActionListener(e -> {
      // Tạo giao diện cho phép người dùng nhập số và chọn phép tính
      String[] options = {"Add", "Subtract", "Multiply", "Divide", "Square Root", "Sin", "Cos", "Exp", "Ln", "Log"};
      String operation = (String) JOptionPane.showInputDialog(mainFrame, "Choose an operation:", "Calculator",
          JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

      if (operation != null) {
        String input1 = JOptionPane.showInputDialog(mainFrame, "Enter first number:");
        if (input1 != null) {
          double num1 = Double.parseDouble(input1);
          double result = 0;

          if (operation.equals("Square Root")) {
            result = calculator.squareRoot(num1);
          } else {
            String input2 = JOptionPane.showInputDialog(mainFrame, "Enter second number:");
            if (input2 != null) {
              double num2 = Double.parseDouble(input2);
              switch (operation) {
                case "Add":
                  result = calculator.add(num1, num2);
                  break;
                case "Subtract":
                  result = calculator.subtract(num1, num2);
                  break;
                case "Multiply":
                  result = calculator.multiply(num1, num2);
                  break;
                case "Divide":
                  try {
                    result = calculator.divide(num1, num2);
                  } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(mainFrame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                  }
                  break;
                case "Sin":
                  result = calculator.sin(num1);
                  break;
                case "Cos":
                  result = calculator.cos(num1);
                  break;
                case "Exp":
                  result = calculator.exp(num1);
                  break;
                case "Ln":
                  result = calculator.ln(num1);
                  break;
                case "Log":
                  result = calculator.log(num1);
                  break;
              }
            }
          }

          JOptionPane.showMessageDialog(mainFrame, "Result: " + result);
        }
      }
    });

    addButton.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame, "Add Product clicked"));
    editButton.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame, "Edit Product clicked"));
    deleteButton.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame, "Delete Product clicked"));
    viewButton.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame, "View Products clicked"));

    JPanel mainPanel = new JPanel();
    mainPanel.add(viewButton);
    mainPanel.add(addButton);
    mainPanel.add(editButton);
    mainPanel.add(deleteButton);
    mainPanel.add(calculateButton);

    mainFrame.getContentPane().add(mainPanel);
    mainFrame.setVisible(true);
  }
}
