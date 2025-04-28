import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class YearlySalary extends JFrame implements ActionListener {
    private JLabel wageLabel;
    private JLabel hoursPerWeekLabel;
    private JLabel salLabel;
    private JTextField wageField;
    private JTextField hoursPerWeekField;
    private JTextField salField;
    private JButton calcButton;
    public YearlySalary() {
        GridBagConstraints layoutConst = null;

        setTitle("Yearly Salary Calculator");

        wageLabel = new JLabel("Hourly wage:");
        hoursPerWeekLabel = new JLabel("Hours worked per week:");
        salLabel = new JLabel("Salary:");

        wageField = new JTextField(15);
        wageField.setEditable(true);
        wageField.setText("0");
        wageField.addActionListener(this);

        hoursPerWeekField = new JTextField(15);
        hoursPerWeekField.setEditable(true);

        salField = new JTextField(15);
        salField.setEditable(false);

        calcButton = new JButton("Calc");
        calcButton.addActionListener(this);

        setLayout(new GridBagLayout());

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        add(wageLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        add(wageField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        add(hoursPerWeekLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        add(hoursPerWeekField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 2;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        add(salLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 2;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        add(salField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 3;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        add(calcButton, layoutConst);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String wageInput;
        String weekInput;
        int hourlyWage;
        int weeklyIncome;

        wageInput = wageField.getText();
        weekInput = hoursPerWeekField.getText();

        hourlyWage = Integer.parseInt(wageInput);
        weeklyIncome = Integer.parseInt(weekInput);


        salField.setText(Integer.toString(hourlyWage * weeklyIncome * 50));
    }

    public static void main(String[] args) {
        YearlySalary salCalculator = new YearlySalary();
        salCalculator.setSize(350, 300);
        salCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        salCalculator.setVisible(true);
    }
}