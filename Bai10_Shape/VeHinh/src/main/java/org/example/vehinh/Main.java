package org.example.vehinh;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("shape.fxml"));
    Parent root = loader.load();
    primaryStage.setTitle("FXML Shapes Example");
    primaryStage.setScene(new Scene(root, 500, 500));
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}

