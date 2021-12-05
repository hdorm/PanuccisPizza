package com.pizza.panuccispizza;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class primaryController implements Initializable {

    //establishes ChoiceBoxes
    @FXML
    private ChoiceBox<String> toppingOne;
    @FXML
    private ChoiceBox<String> toppingTwo;
    @FXML
    private ChoiceBox<String> toppingThree;
    @FXML
    private ChoiceBox<String> toppingFour;
    @FXML
    private ChoiceBox<String> sodaSize;
    @FXML
    private ChoiceBox<String> waterSize;
    @FXML
    private ChoiceBox<String> teaSize;
    @FXML
    private ChoiceBox<String> paymentMethod;

    //creates ChoiceBox options
    private final String[] toppings = {"Cheese", "Pepperoni", "Sausage", "Ham", "Olives", "Mushrooms", "Bell Peppers", "Pineapple", "Nothing"};
    private final String[] drinks = {"Small: $1", "Medium: $2", "Large: $3"};
    private final String[] payment = {"Card", "Cash", "Check"};

    //initializes the ChoiceBoxes
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        toppingOne.getItems().addAll(toppings);
        toppingTwo.getItems().addAll(toppings);
        toppingThree.getItems().addAll(toppings);
        toppingFour.getItems().addAll(toppings);
        sodaSize.getItems().addAll(drinks);
        waterSize.getItems().addAll(drinks);
        teaSize.getItems().addAll(drinks);
        paymentMethod.getItems().addAll(payment);

    }

}
