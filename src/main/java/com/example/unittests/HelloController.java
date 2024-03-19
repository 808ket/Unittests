package com.example.unittests;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private TextField speed;
    @FXML
    private Label punish;
    @FXML
    private Label alert;

    @FXML
    protected void calculate() {

        String speedInput = speed.getText(); // Abrufen des eingegebenen Werts
        if(speedInput.matches("[A-Za-z]")) {
            alert.setText("Bitte nur Zahlen eingeben!");
        }else{
            alert.setVisible(false);
        }
        int speed = Integer.parseInt(speedInput); // Konvertierung in einen Integer
        Fees fees1 = new Fees();
        Double speedy = fees1.estimateFee(speed);
        String money = String.valueOf(speedy);
        String money2 = money.replace('.', ',');
        punish.setText(money2 + "0 €");

    }
}