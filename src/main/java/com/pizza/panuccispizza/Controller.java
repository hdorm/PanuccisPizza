package com.pizza.panuccispizza;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

//Initial Setup
    private Stage stage;
    private Scene scene;
    private Parent root;

//Build-a-pizza
    @FXML
    private ChoiceBox toppingOne;
    private ChoiceBox toppingTwo;
    private ChoiceBox toppingThree;
    private ChoiceBox toppingFour;

    public void switchToPrimary(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("builderScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToFinal(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pizzaFinal.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}