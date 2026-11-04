module com.example.oop_practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_practice to javafx.fxml;
    exports com.example.oop_practice;
}