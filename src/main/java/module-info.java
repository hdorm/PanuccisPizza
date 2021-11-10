module com.pizza.panuccispizza {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pizza.panuccispizza to javafx.fxml;
    exports com.pizza.panuccispizza;
}