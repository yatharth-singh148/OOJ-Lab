import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionCalculator extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;
    public DivisionCalculator() {
        setTitle("Integer Division Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JLabel num1Label = new JLabel("Num1:");
        num1Field = new JTextField(10);
        JLabel num2Label = new JLabel("Num2:");
        num2Field = new JTextField(10);
        divideButton = new JButton("Divide");
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(10);
        resultField.setEditable(false);
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(divideButton);
        add(resultLabel);
        add(resultField);
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String num1Text = num1Field.getText();
                    String num2Text = num2Field.getText();
                    int num1 = Integer.parseInt(num1Text);
                    int num2 = Integer.parseInt(num2Text);
                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(DivisionCalculator.this,
                            "Invalid input! Please enter valid integers.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);

                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(DivisionCalculator.this,
                            "Cannot divide by zero!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DivisionCalculator();
            }
        });
    }
}


//This program uses the AWT class of java to make a local UI for our program. It performs a basic division between two numbers.
