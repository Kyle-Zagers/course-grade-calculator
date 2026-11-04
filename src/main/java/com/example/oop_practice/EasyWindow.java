package com.example.oop_practice;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class EasyWindow extends HelloApplication {

    private Stage stage;
    private Scene newSubject;
    private BorderPane pane;
    private Button calc;
    private Button add;
    private ArrayList<Subject> subjects = new ArrayList();

    public EasyWindow(String name)
    {
        pane = new BorderPane();


        Text nSubjectT = new Text("New Subject:");
        TextArea nSubjectF = new TextArea();
        Text periodT = new Text("Period:");
        TextArea periodF = new TextArea();

        HBox center = new HBox();
        VBox  subject = new VBox();
        VBox period = new VBox();

        subject.getChildren().addAll(nSubjectT,nSubjectF);
        period.getChildren().addAll(periodT, periodF);
        center.getChildren().addAll(subject,period);

        pane.setCenter(center);


        VBox buttons = new VBox();

        add = new Button("add");
        add.setOnAction(e -> subjects.add(new Subject(nSubjectF.getText(), Integer.parseInt(periodF.getText()))));

        calc = new Button("calc");
        calc.setOnAction(e -> GradeCalc.grade());

        buttons.getChildren().addAll(add,calc);
        pane.setRight(buttons);


        newSubject = new Scene(pane, 25.0, 30.0);
        stage = new Stage();

        stage.setScene(newSubject);
        stage.setTitle(name);
    }

    public EasyWindow(String name, double w, double h)
    {
        this(name);
        changeSize(w,h);
    }


    public void showScene()
    {
        stage.show();
    }

    public void changeSize(double w, double h)
    {
        stage.setWidth(w);
        stage.setHeight(h);
    }



}