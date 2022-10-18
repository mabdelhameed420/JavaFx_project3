package com.example.demo4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vb = new VBox(10);

        Pane pane = new StackPane();
        VBox vb1 = new VBox(20);
        Rectangle r = new Rectangle(100,230);
        r.setFill(Color.WHITE);
        r.setStroke(Color.BLACK);
        vb1.setPadding(new Insets(20));
        vb1.setAlignment(Pos.CENTER);
        vb1.getChildren().add(r);

        VBox vb2 = new VBox(10);
        vb2.setAlignment(Pos.CENTER);
        Circle c1 = new Circle(30);
        c1.setFill(Color.BLACK);
        Circle c2 = new Circle(30);
        c1.setFill(Color.BLACK);
        Circle c3 = new Circle(30);
        c1.setFill(Color.BLACK);
        vb2.getChildren().addAll(c1,c2,c3);
        pane.getChildren().addAll(vb1,vb2);

        RadioButton rb1 = new RadioButton("Red");
        rb1.setOnAction(e->{
            if (rb1.isSelected()) {
                c1.setFill(Color.RED);
                c2.setFill(Color.BLACK);
                c3.setFill(Color.BLACK);
            }
        });

        RadioButton rb2 = new RadioButton("Yellow");
        rb2.setOnAction(e->{
            if (rb2.isSelected()) {
                c1.setFill(Color.BLACK);
                c2.setFill(Color.YELLOW);
                c3.setFill(Color.BLACK);
            }
        });

        RadioButton rb3 = new RadioButton("Green");
        rb3.setOnAction(e->{
            if (rb3.isSelected()) {
                c1.setFill(Color.BLACK);
                c2.setFill(Color.BLACK);
                c3.setFill(Color.GREEN);
            }
        });

        ToggleGroup group = new ToggleGroup();
        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);

        HBox hb = new HBox(10);
        hb.getChildren().addAll(rb1,rb2,rb3);
        hb.setAlignment(Pos.CENTER);
        vb.getChildren().addAll(pane,hb);

        Scene scene = new Scene(vb,300,350);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}