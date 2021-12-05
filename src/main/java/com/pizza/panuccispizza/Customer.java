package com.pizza.panuccispizza;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer {
    private final StringProperty phoneNumber;
    private final StringProperty address;
    private final StringProperty paymentInformation;

    public Customer() {
        this(null);
    }

    public Customer(String phoneNumber) {
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.address = new SimpleStringProperty("Manhattan, Old New York");
        this.paymentInformation = new SimpleStringProperty("Cash");
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }
    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public String getAddress() {
        return address.get();
    }
    public void setAddress(String address) {
        this.address.set(address);
    }
    public StringProperty addressProperty() {
        return address;
    }

    public String getPaymentInformation() {
        return paymentInformation.get();
    }
    public void setPaymentInformation(String paymentInformation) {
        this.paymentInformation.set(paymentInformation);
    }
    public StringProperty paymentInformationProperty() {
        return paymentInformation;
    }
}
