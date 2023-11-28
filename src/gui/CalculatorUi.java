package gui;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;

public class CalculatorUi extends JFrame {

    private final SpringLayout springLayout = new SpringLayout();
    private JTextField displayTextField;

    public CalculatorUi(){
        super(CommonConstants.APP_NAME);
        setSize(CommonConstants.APP_SIZE[0], CommonConstants.APP_SIZE[1]);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(springLayout);

        addGuiComponents();
    }

    public void addGuiComponents(){

        addDisplayFieldsComponents();

        addButtonComponents();
    }

    public void addDisplayFieldsComponents(){
        JPanel displayFieldPanel = new JPanel();
        displayTextField = new JTextField(CommonConstants.TEXTFIELD_LENGTH);
        displayTextField.setFont(new Font("Dialog", Font.PLAIN, CommonConstants.TEXTFIELD_FONTSIZE));
        displayTextField.setEditable(false);
        displayTextField.setText("0");

        displayFieldPanel.add(displayTextField);

        this.getContentPane().add(displayFieldPanel);

    }

    public void addButtonComponents(){

    }




}
