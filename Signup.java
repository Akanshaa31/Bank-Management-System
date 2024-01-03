package bank.managment.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    JTextField textName,textFname,textEmail,textAdd,textCity,textPin,textState;// declared globaly because we need to store them in database and require desiered function for this outside signup class
    JDateChooser dateChooser;  // we need to import jar file
      Random ran = new Random();  // generate a random number for application number
      long first4 = (ran.nextLong() % 9000L) + 1000L;  // the random number should contain 4 digits
    String first =" " + Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO. " + first); // random number should be present after this heading
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details: ");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(270,100,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,170,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.PLAIN,14));
        textName.setBounds(300,170,400,30);
        add(textName);

        JLabel labelFname = new JLabel("Father's Name :");
        labelFname.setFont(new Font("Raleway",Font.BOLD,20));
        labelFname.setBounds(100,230,200,30);
        add(labelFname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.PLAIN,14));
        textFname.setBounds(300,230,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,290,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,350,100,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.PLAIN,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,350,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.PLAIN,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(400,350,80,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();  // only one out of two option will be selected
        buttonGroup.add(r1);  //it is called "group by method
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("E-Mail :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,410,150,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.PLAIN,14));
        textEmail.setBounds(300,410,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,470,150,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.PLAIN,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,470,80,30);
        add(m1);

        m2 = new JRadioButton("UnMarried");
        m2.setFont(new Font("Raleway",Font.PLAIN,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(400,470,100,30);
        add(m2);

        m3 = new JRadioButton("Other ");
        m3.setFont(new Font("Raleway",Font.PLAIN,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(520,470,100,30);
        add(m3);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);
        buttonGroup2.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,530,150,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.PLAIN,14));
        textAdd.setBounds(300,530,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,590,150,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.PLAIN,14));
        textCity.setBounds(170,590,150,30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(450,590,150,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.PLAIN,14));
        textPin.setBounds(570,590,100,30);
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(270,650,150,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.PLAIN,14));
        textState.setBounds(340,650,170,30);
        add(textState);

        next = new JButton("NEXT ");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setForeground(Color.BLACK);  //color of text
        next.setBackground(Color.getHSBColor(102,102,153));
        next.setBounds(700,700,120,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));//color picker provide rgb value for required color
        setLayout(null);
        setSize(850,780);
        setLocation(360,30);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();  // get data from signup page
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText(); // get date from calender
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "Married";
        }
        else if(m2.isSelected()){
            marital = "Unmarried";
        }
        else{
            marital = "Other";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();
         // store data in database
        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else{
                // create database connection
                Con con1 = new Con();
                // run query to store data in database
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q); //insert into database
                new Signup2(formno);  //new class opened
                setVisible(false);  //close frame
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
