package com.pizza.panuccispizza;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    //launches first window
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.LIGHTGRAY);

        //creates title for log-in screen
        Text text = new Text();
        text.setText("Panucci's Pizza");
        text.setX(35);
        text.setY(50);
        text.setFont(Font.font("Calibri", FontWeight.BOLD ,25));
        text.setFill(Color.RED);

        //sets program icon to pizza
        Image icon = new Image("/pizzaicon.png");
        stage.getIcons().add(icon);

        //makes the log-in screen smaller
        stage.setWidth(250);
        stage.setHeight(250);

        //changes title of window
        stage.setTitle("Panucci's Pizza");

        root.getChildren().add(text);
        stage.setScene(scene);
        stage.show();
    }

}