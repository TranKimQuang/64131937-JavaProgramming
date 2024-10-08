package HomeWork.Bai6.BMI.src.main.java.com.example.bmi;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Máy Tính BMI");

        // Tạo GridPane
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Nhãn và ô nhập liệu cho Cân nặng
        Label weightLabel = new Label("Cân nặng (kg):");
        GridPane.setConstraints(weightLabel, 0, 0);

        TextField weightInput = new TextField();
        GridPane.setConstraints(weightInput, 1, 0);

        // Nhãn và ô nhập liệu cho Chiều cao
        Label heightLabel = new Label("Chiều cao (m):");
        GridPane.setConstraints(heightLabel, 0, 1);

        TextField heightInput = new TextField();
        GridPane.setConstraints(heightInput, 1, 1);

        // Nút để tính BMI
        Button calculateButton = new Button("Tính BMI");
        GridPane.setConstraints(calculateButton, 1, 2);

        // Nhãn để hiển thị kết quả BMI và lời khuyên
        Label resultLabel = new Label();
        GridPane.setConstraints(resultLabel, 1, 3);

        // Lời khuyên dựa trên chỉ số BMI
        Label adviceLabel = new Label();
        GridPane.setConstraints(adviceLabel, 1, 4);

        // Tính BMI khi nhấn nút
        calculateButton.setOnAction(e -> {
            try {
                double weight = Double.parseDouble(weightInput.getText());
                double height = Double.parseDouble(heightInput.getText());
                double bmi = weight / (height * height);

                // Hiển thị chỉ số BMI
                resultLabel.setText(String.format("Chỉ số BMI của bạn là: %.2f", bmi));

                // Đưa ra lời khuyên dựa trên chỉ số BMI
                if (bmi < 18.5) {
                    adviceLabel.setText("Bạn gầy.");
                } else if (bmi >= 18.5 && bmi <= 24.9) {
                    adviceLabel.setText("Bạn có cân nặng bình thường.");
                } else if (bmi >= 25 && bmi <= 29.9) {
                    adviceLabel.setText("Bạn thừa cân.");
                } else {
                    adviceLabel.setText("Bạn béo phì.");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Vui lòng nhập số hợp lệ.");
                adviceLabel.setText("");
            }
        });

        // Thêm tất cả thành phần vào grid
        grid.getChildren().addAll(weightLabel, weightInput, heightLabel, heightInput, calculateButton, resultLabel, adviceLabel);

        // Thiết lập cảnh
        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
