package com.group9.tipcalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class tipcontroller {
    // decalring varaibles to handle the tip calculation

    @FXML
    private TextField amtTf;

    @FXML
    private TextField tipamtTf;

    @FXML
    private TextField totalAmtTf;

    @FXML
    private Slider tipPercentslider;

    @FXML
    private TextField tipPercentlabel;

    // currency formatter to format the tip amount and total amount to currency format

    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();

    private static final NumberFormat percent = NumberFormat.getPercentInstance();

    private BigDecimal tipPercent = new BigDecimal("0.15"); // default tip percentage is 15%

    @FXML
    private void initialize() {
        // update tipPercent whenever the slider value changes
        tipPercentslider.valueProperty().addListener((obs, oldVal, newVal) -> {
            tipPercent = BigDecimal.valueOf(newVal.doubleValue()).divide(new BigDecimal("100"));
            tipPercentlabel.setText(percent.format(tipPercent.doubleValue()));
        });
        // set initial label value
        tipPercentlabel.setText(percent.format(tipPercent.doubleValue()));
    }

    @FXML
    private void calculateBTNPressed(ActionEvent event) {

        try {
            // get values
            BigDecimal amount = new BigDecimal(amtTf.getText());

            // multiply by the tip percent in line 34
            BigDecimal tip = amount.multiply(tipPercent);

            // add the total
            BigDecimal total = amount.add(tip);


            // displaying amount or figures in the respective fields
            tipamtTf.setText(currency.format(tip));

            totalAmtTf.setText(currency.format(total));
        }
        catch (NumberFormatException e){

            // prompts the user if the user enters wrong value
            amtTf.setText("Enter A valid  Amount");

            tipamtTf.selectAll();

            totalAmtTf.requestFocus();
        }



    }
}
