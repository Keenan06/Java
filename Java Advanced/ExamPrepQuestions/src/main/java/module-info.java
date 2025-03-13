module com.example.examprepquestions {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examprepquestions to javafx.fxml;
    exports com.example.examprepquestions;
}