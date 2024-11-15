module org.example.bai11_vejava {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.bai11_vejava to javafx.fxml;
    exports org.example.bai11_vejava;
}