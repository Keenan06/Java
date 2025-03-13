module com.example.javafx_application {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.javafx_application to javafx.fxml;
    exports com.example.javafx_application;
}