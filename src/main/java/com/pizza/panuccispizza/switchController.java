package com.pizza.panuccispizza;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class switchController {

    //Initial Setup
    private Stage stage;
    private Scene scene;

    //Moves from one Scene to the other
    public void switchToPrimary(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("primaryScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToReceipt(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("receiptScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}