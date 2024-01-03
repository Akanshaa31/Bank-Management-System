package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;
    public Signup3(String formno) {
        this.formno=formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);  // to make image visible on frame
        image.setBounds(80,10,100,100);  // where on the frame the image will be visible
        add(image); // JLabel wala image

        JLabel l12 = new JLabel(" FORM NO. "); // random number should be present after this heading
        l12.setBounds(500,20,350,40);
        l12.setFont(new Font("Raleway",Font.BOLD,38));
        add(l12);

        JLabel l13 = new JLabel(formno); // random generated form no passed globally
        l13.setBounds(700,20,600,40);
        l13.setFont(new Font("Raleway",Font.BOLD,38));
        add(l13);

        JLabel l1 = new JLabel("Page 3");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(330,70,600,30);
        add(l1);

        JLabel l2 = new JLabel("Account Details: ");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(270,100,600,30);
        add(l2);

        JLabel l3 = new JLabel("Account type :");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(100,170,200,30);
        add(l3);

        r1 = new JRadioButton("Savings Account");
        r1.setBackground(new Color(236, 154, 229));
        r1.setFont(new Font("Raleway",Font.PLAIN,14));
        r1.setBounds(100,210,150,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBackground(new Color(236, 154, 229));
        r2.setFont(new Font("Raleway",Font.PLAIN,14));
        r2.setBounds(350,210,300,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBackground(new Color(236, 154, 229));
        r3.setFont(new Font("Raleway",Font.PLAIN,14));
        r3.setBounds(100,250,150,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBackground(new Color(236, 154, 229));
        r4.setFont(new Font("Raleway",Font.PLAIN,14));
        r4.setBounds(350,250,300,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card no :");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,300,100,20);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.PLAIN,13));
        l5.setBounds(100,320,400,30);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(330,300,400,20);
        add(l6);

        JLabel l7 = new JLabel("It would appear on ATM card/cheque Book and Statement");
        l7.setFont(new Font("Raleway",Font.PLAIN,13));
        l7.setBounds(330,320,600,30);
        add(l7);

        JLabel l8 = new JLabel("PIN :");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(100,380,100,20);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(330,380,100,20);
        add(l9);

        JLabel l10 = new JLabel("(4-digit password)");
        l10.setFont(new Font("Raleway",Font.PLAIN,14));
        l10.setBounds(100,400,250,20);
        add(l10);

        JLabel l11 = new JLabel("Services Required :");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,450,250,20);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(236, 154, 229));
        c1.setFont(new Font("Raleway",Font.PLAIN,14));
        c1.setBounds(100,490,150,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(236, 154, 229));
        c2.setFont(new Font("Raleway",Font.PLAIN,14));
        c2.setBounds(350,490,250,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(236, 154, 229));
        c3.setFont(new Font("Raleway",Font.PLAIN,14));
        c3.setBounds(100,530,250,30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(236, 154, 229));
        c4.setFont(new Font("Raleway",Font.PLAIN,14));
        c4.setBounds(350,530,300,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(236, 154, 229));
        c5.setFont(new Font("Raleway",Font.PLAIN,14));
        c5.setBounds(100,570,250,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(236, 154, 229));
        c6.setFont(new Font("Raleway",Font.PLAIN,14));
        c6.setBounds(350,570,300,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I hearby declare that above entered details are correct to the best of my Knowledge",true);
        c7.setBackground(new Color(236, 154, 229));
        c7.setFont(new Font("Raleway",Font.PLAIN,14));
        c7.setBounds(100,630,800,30);
        add(c7);

        s = new JButton("Submit");
        s.setBackground(new Color(192, 184, 184));
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBounds(250,670,130,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setBackground(new Color(192, 184, 184));
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBounds(450,670,130,30);
        c.addActionListener(this);
        add(c);


        setLayout(null);
        setSize(850,780);
        setLocation(360,30);
        getContentPane().setBackground(new Color(236, 154, 229));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if(r1.isSelected()){
            atype = "Savings Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){
            atype = "Current Account";
        }
        else {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1489963000000000L;
        String cardno = ""+ Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac += "ATM CARD"; // + sign because more than one option can be selected
        } else if (c2.isSelected()) {
            fac += "Internet Banking";
        } else if (c3.isSelected()) {
            fac += "Mobile Banking";
        } else if (c4.isSelected()) {
            fac += "EMAIL Alerts";
        } else if (c5.isSelected()) {
            fac += "Cheque Book";
        }
        else{
            fac += "E-Statement";
        }

        try{
            if(e.getSource()==s){  // if submit button is selected
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the Fields");
                }
                else{
                    Con c1 = new Con();
                    String q1 = "insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number :"+cardno + "\nPin :"+ pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==c) { // on clicking cancel button
                System.exit(0);  // entire system gets close
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new Signup3("");
    }
}
