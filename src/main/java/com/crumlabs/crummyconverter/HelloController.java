package com.crumlabs.crummyconverter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField nairaInput, dollarInput, poundInput;


    @FXML
    protected void calc() {
        String nairStr = nairaInput.getText().toString();
        int nairaAmt = Integer.parseInt(nairStr);
        double dollarAmt = nairaAmt / 522;
        dollarInput.setText("" + dollarAmt);
        double poundAmt = nairaAmt / 710;
        poundInput.setText(""+ poundAmt);
    }



}