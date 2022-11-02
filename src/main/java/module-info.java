module com.example.javabasic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javabasic to javafx.fxml;
    exports com.example.javabasic;
}