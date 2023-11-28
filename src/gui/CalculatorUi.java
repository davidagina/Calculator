package gui;

import constants.CommonConstants;

import javax.swing.*;

public class CalculatorUi extends JFrame {

    public CalculatorUi(){
        super(CommonConstants.APP_NAME);
        setSize(CommonConstants.APP_SIZE[0], CommonConstants.APP_SIZE[1]);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
