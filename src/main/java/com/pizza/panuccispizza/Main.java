package com.pizza.panuccispizza;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/loginScene.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Panucci's Pizza");
            stage.getIcons().add(new Image("/tinypizzaicon.png"));
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

