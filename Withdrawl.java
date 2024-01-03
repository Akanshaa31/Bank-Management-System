package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;
import java.util.Date;


public class Withdrawl extends JFrame implements ActionListener {
    String pin;
    JButton b1, b2;
    JTextField textField;

    Withdrawl(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);


        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS 10,000");
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460, 180, 400, 35);
        label1.setForeground(Color.WHITE);  //color of text
        l3.add(label1);  // show label over the bg pic

        JLabel label2 = new JLabel("ENTER THE AMOUNT YOU WANT TO WITHDRAW");
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(460, 210, 400, 35);
        label2.setForeground(Color.WHITE);  //color of text
        l3.add(label2);

        textField = new JTextField();
        textField.setBackground(new Color(79, 127, 129));
        textField.setForeground(Color.white);
        textField.setFont(new Font("System", Font.BOLD, 22));
        textField.setBounds(460, 250, 200, 30);
        l3.add(textField);

        b1 = new JButton("Withdraw");
        b1.setBackground(new Color(65, 128, 128));
        b1.setFont(new Font("Raleway", Font.BOLD, 22));
        b1.setBounds(700, 362, 150, 35);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Back");
        b2.setBackground(new Color(65, 128, 128));
        b2.setFont(new Font("Raleway", Font.BOLD, 22));
        b2.setBounds(700, 406, 150, 35);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550, 1000);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insuffient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_Class(pin);

                }
            } catch (Exception E) {

            }
        } else if (e.getSource() == b2) {
            setVisible(false);
            new main_Class(pin);
        }
    }


    public static void main(String[] args) {
        new Withdrawl("");
    }
}
