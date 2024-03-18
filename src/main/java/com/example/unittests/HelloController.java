package com.example.unittests;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField speedTextField; // Referenz zur TextField-Komponente

    @FXML
    protected void onHelloButtonClick() {
        System.out.println("Funktioniert");

        String speedInput = speedTextField.getText(); // Abrufen des eingegebenen Werts
        int speed = Integer.parseInt(speedInput); // Konvertierung in einen Integer

        // Verarbeite den eingegebenen Wert weiter...
        System.out.println("Eingegebene Geschwindigkeit: " + speed);

        Fees fees1 = new Fees();
        System.out.println( fees1.estimateFee(speed));
        fees1.estimateFee(speed);
    }
}