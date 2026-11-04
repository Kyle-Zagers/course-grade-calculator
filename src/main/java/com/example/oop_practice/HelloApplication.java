package com.example.oop_practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        EasyWindow first = new EasyWindow("EasyWindow");
        first.changeSize(360.0, 240.0);
        first.showScene();


    }

    public static void main(String[] args) {
        launch();
    }
}
