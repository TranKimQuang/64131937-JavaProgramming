package org.example.bai11_vejava;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Draw extends Application {

  @Override
  public void start(Stage primaryStage) {
    // Tạo một StackPane để chứa Canvas
    StackPane root = new StackPane();

    // Tạo Canvas với kích thước cụ thể
    Canvas canvas = new Canvas(400, 400);

    // Lấy GraphicsContext từ Canvas để vẽ
    GraphicsContext gc = canvas.getGraphicsContext2D();

    // Vẽ hình tam giác lớn
    gc.setStroke(Color.BLACK);
    gc.setLineWidth(2);
    gc.setFill(Color.WHITE);
    gc.beginPath();
    gc.lineTo(192.6, 152.8);
    gc.lineTo(100.0, 250.0);
    gc.lineTo(300.0, 250.0);
    gc.closePath();
    gc.fill();
    gc.stroke();

    // Vẽ tai trái
    gc.beginPath();
    gc.lineTo(180.0, 165.9);
    gc.lineTo(150.0, 146.4);
    gc.lineTo(160.0, 183.0);
    gc.closePath();
    gc.fill();
    gc.stroke();

    // Vẽ tai phải
    gc.beginPath();
    gc.lineTo(210.0, 165.9);
    gc.lineTo(240.6, 146.2);
    gc.lineTo(230.0, 183.0);
    gc.closePath();
    gc.fill();
    gc.stroke();

    // Vẽ tam giác nhỏ bên trong
    gc.setStroke(Color.RED);
    gc.beginPath();
    gc.lineTo(223.4, 220.4);
    gc.lineTo(185.0, 220.4);
    gc.lineTo(204.4, 240.0);
    gc.closePath();
    gc.fill();
    gc.stroke();

    // Vẽ thân hình tròn bên dưới (Arc)
    gc.setStroke(Color.BLACK);
    gc.setLineWidth(2);
    gc.setFill(Color.WHITE);
    gc.beginPath();
    gc.arc(200, 300, 70, 70, 140.7, 260);

    gc.fill();
    gc.stroke();

    // Vẽ chân trái (Circle)
    gc.setFill(Color.WHITE);
    gc.setStroke(Color.BLACK);
    gc.setLineWidth(2);
    gc.beginPath();
    gc.arc(160, 370, 20, 20, 0, 360);
    gc.closePath();
    gc.fill();
    gc.stroke();

    // Vẽ chân phải (Circle)
    gc.beginPath();
    gc.arc(240, 370, 20, 20, 0, 360);
    gc.closePath();
    gc.fill();
    gc.stroke();

    // Vẽ các đường cong dưới chân trái
    gc.setStroke(Color.RED);
    gc.setLineWidth(2);
    gc.beginPath();
    gc.arc(160, 370, 16, 15, -52.6, 120);
    gc.stroke();

    // Vẽ các đường cong dưới chân phải
    gc.beginPath();
    gc.arc(240, 370, 16, 15, -52.6, 120);
    gc.stroke();

    // Vẽ các đường cong chân trái (bên dưới)
    gc.beginPath();
    gc.arc(160, 370, 16, 15, 127.8, 120);
    gc.stroke();

    // Vẽ các đường cong chân phải (bên dưới)
    gc.beginPath();
    gc.arc(240, 370, 16, 15, 127.8, 120);
    gc.stroke();

    // Thêm Canvas vào StackPane
    root.getChildren().add(canvas);

    // Tạo Scene và hiển thị cửa sổ
    Scene scene = new Scene(root, 400, 400);
    primaryStage.setTitle("Vẽ Hình với Canvas");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
