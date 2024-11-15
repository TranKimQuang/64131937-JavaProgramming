module org.example.vehinh {
  requires javafx.controls;
  requires javafx.fxml;


  opens org.example.vehinh to javafx.fxml;
  exports org.example.vehinh;
}