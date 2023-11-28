package gui;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUi extends JFrame implements ActionListener {

    private final SpringLayout springLayout = new SpringLayout();
    private JTextField displayTextField;
    private JButton[] buttons;

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
        displayTextField.setHorizontalAlignment(SwingConstants.RIGHT);

        displayFieldPanel.add(displayTextField);

        this.getContentPane().add(displayFieldPanel);

        springLayout.putConstraint(SpringLayout.NORTH, displayFieldPanel, CommonConstants.TEXTFIELD_SPRINGLAYOUT_NORTHPAD, springLayout.NORTH, this);
        springLayout.putConstraint(SpringLayout.WEST, displayFieldPanel, CommonConstants.TEXTFIELD_SPRINGLAYOUT_WESTPAD, SpringLayout.WEST, this);


    }

    public void addButtonComponents(){

        GridLayout gridLayout = new GridLayout(CommonConstants.BUTTON_ROWCOUNT, CommonConstants.BUTTON_COLCOUNT);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(gridLayout);
        buttons = new JButton[CommonConstants.BUTTON_COUNT];
        for (int i = 0; i < CommonConstants.BUTTON_COUNT; i++){
            JButton button = new JButton(getButtonLabel(i));
            button.setFont(new Font("Dialog", Font.PLAIN, CommonConstants.BUTTON_FONTSIZE));
            button.addActionListener(this);

            buttonPanel.add(button);
        }

        this.getContentPane().add(buttonPanel);

    }

    public String getButtonLabel(int buttonIndex){
        switch(buttonIndex){
            case 0:
                return "7";
            case 1:
                return "8";
            case 2:
                return "9";
            case 3:
                return "-";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "x";
            case 8:
                return "1";
            case 9:
                return "2";
            case 10:
                return "3";
            case 11:
                return "0";
            case 12:
                return ".";
            case 13:
                return "+";
            case 14:
                return "=";
            case 15:
                return "/";
        }
        return "";
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
