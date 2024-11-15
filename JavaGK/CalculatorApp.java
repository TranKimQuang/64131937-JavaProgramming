import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame implements ActionListener {
  private JTextField display;
  private String operator;
  private double firstOperand;

  public CalculatorApp() {
    // Thiết lập tiêu đề và kích thước
    setTitle("Calculator");
    setSize(400, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    // Tạo màn hình hiển thị
    display = new JTextField();
    display.setEditable(false);
    display.setFont(new Font("Arial", Font.BOLD, 36));
    display.setHorizontalAlignment(SwingConstants.RIGHT);
    display.setBackground(new Color(230, 230, 250)); // Màu nền nhẹ nhàng
    add(display, BorderLayout.NORTH);

    // Tạo các nút
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(5, 4, 10, 10));
    panel.setBackground(new Color(240, 248, 255)); // Màu nền cho panel

    String[] buttonLabels = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+",
        "C", "sqrt", "sin", "cos"
    };

    for (String label : buttonLabels) {
      JButton button = new JButton(label);
      button.setFont(new Font("Arial", Font.BOLD, 24));
      button.setBackground(new Color(173, 216, 230)); // Màu xanh nhạt cho nút
      button.setForeground(Color.BLACK);
      button.setFocusable(false);
      button.addActionListener(this);
      button.setBorder(BorderFactory.createEtchedBorder());
      // Thêm hiệu ứng khi di chuột qua nút
      button.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
          button.setBackground(new Color(135, 206, 250)); // Đổi màu khi hover
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
          button.setBackground(new Color(173, 216, 230)); // Đổi lại màu khi ra ngoài
        }
      });
      panel.add(button);
    }

    add(panel, BorderLayout.CENTER);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();

    switch (command) {
      case "C":
        display.setText("");
        break;
      case "=":
        calculateResult();
        break;
      case "sqrt":
        calculateSquareRoot();
        break;
      case "sin":
        calculateSin();
        break;
      case "cos":
        calculateCos();
        break;
      default:
        handleNumberOrOperator(command);
        break;
    }
  }

  private void handleNumberOrOperator(String command) {
    if (isOperator(command)) {
      firstOperand = Double.parseDouble(display.getText());
      operator = command;
      display.setText("");
    } else {
      display.setText(display.getText() + command);
    }
  }

  private boolean isOperator(String command) {
    return command.equals("/") || command.equals("*") ||
        command.equals("-") || command.equals("+");
  }

  private void calculateResult() {
    double secondOperand = Double.parseDouble(display.getText());
    double result = 0;

    switch (operator) {
      case "+":
        result = firstOperand + secondOperand;
        break;
      case "-":
        result = firstOperand - secondOperand;
        break;
      case "*":
        result = firstOperand * secondOperand;
        break;
      case "/":
        if (secondOperand != 0) {
          result = firstOperand / secondOperand;
        } else {
          display.setText("Error");
          return;
        }
        break;
    }
    display.setText(String.valueOf(result));
  }

  private void calculateSquareRoot() {
    double value = Double.parseDouble(display.getText());
    display.setText(String.valueOf(Math.sqrt(value)));
  }

  private void calculateSin() {
    double value = Double.parseDouble(display.getText());
    display.setText(String.valueOf(Math.sin(Math.toRadians(value))));
  }

  private void calculateCos() {
    double value = Double.parseDouble(display.getText());
    display.setText(String.valueOf(Math.cos(Math.toRadians(value))));
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      CalculatorApp app = new CalculatorApp();
      app.setVisible(true);
      app.setLocationRelativeTo(null); // Đặt ứng dụng vào giữa màn hình
    });
  }
}
