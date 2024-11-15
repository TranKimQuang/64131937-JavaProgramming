package org.example.vehinh;


import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Arc;

public class ShapeController {

  @FXML
  private Circle myCircleLeft;  // Chân trái

  @FXML
  private Circle myCircleRight;  // Chân phải

  @FXML
  private Polygon myTriangle;  // Tam giác lớn

  @FXML
  private Polygon myLeftEar;  // Tai trái

  @FXML
  private Polygon myRightEar;  // Tai phải

  @FXML
  private Polygon myInnerTriangle;  // Tam giác nhỏ bên trong

  @FXML
  private Arc myBody;  // Thân hình tròn

  @FXML
  private Arc myLeftLegArc;  // Đường tròn đỏ trong chân trái

  @FXML
  private Arc myRightLegArc;  // Đường tròn đỏ trong chân phải

  private double initialX;
  private double initialY;

  @FXML
  public void initialize() {
    // Thiết lập di chuyển cho các hình
    enableDrag(myTriangle);
    enableDrag(myLeftEar);
    enableDrag(myRightEar);
    enableDrag(myInnerTriangle);
    enableDrag(myBody);
    enableDrag(myCircleLeft);
    enableDrag(myCircleRight);
    enableDrag(myLeftLegArc);
    enableDrag(myRightLegArc);
  }

  // Phương thức thêm sự kiện kéo cho hình
  private void enableDrag(javafx.scene.shape.Shape shape) {
    if (shape != null) {
      shape.setOnMousePressed(e -> {
        initialX = e.getSceneX() - shape.getLayoutX();
        initialY = e.getSceneY() - shape.getLayoutY();
      });

      shape.setOnMouseDragged(e -> {
        shape.setLayoutX(e.getSceneX() - initialX);
        shape.setLayoutY(e.getSceneY() - initialY);
      });
    }
  }
}
