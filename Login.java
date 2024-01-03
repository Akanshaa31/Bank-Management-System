package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;// declaring global variable
    JTextField text2;
    JPasswordField password3;
    JButton b1,b2,b3;

    Login(){
        super("Bank Management System");  // title for the frame which is visible at the top in small font (it should be at the top as it is the title)

       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
       Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);  // to make image visible on frame
        image.setBounds(350,10,100,100);  // where on the frame the image will be visible
        add(image); // JLabel wala image

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);  // to make image visible on frame
        iimage.setBounds(630,350,100,100);  // where on the frame the image will be visible
        add(iimage); // JLabel wala image

        label1 = new JLabel("WELCOME TO ATM");  //actual us of JLabel: show the text on the frame
        label1.setForeground(Color.yellow);  // to set color of text
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.black);
        label2.setBounds(150,190,375,30);
        add(label2);

        text2 = new JTextField(15);
        text2.setBounds(325,190,230,30);
        text2.setFont(new Font("Arial", Font.BOLD,14));
        add(text2);

        label3 = new JLabel("Pin: ");
        label3.setForeground(Color.black);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        password3 = new JPasswordField(15);
        password3.setBounds(325,250,230,30);
        password3.setFont(new Font("Arial",Font.BOLD,14));
        add(password3);

        b1= new JButton("SIGN IN  ");
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setForeground(Color.BLACK);  //color of text
        b1.setBackground(Color.yellow); // color of background
        b1.setBounds(300,300,100,30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CLEAR");
        b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.yellow);
        b2.setBounds(450,300,100,30);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("SIGN UP ");
        b3.setFont(new Font("Arial",Font.BOLD,14));
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.yellow);
        b3.setBounds(370,350,100,30);
        b3.addActionListener(this);
        add(b3);

        // it should be at the last as it is background image
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT); // as size of frame the cover the entire background
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);  // to make image visible on frame
        iiimage.setBounds(0,0,850,480);  // where on the frame the image will be visible
        add(iiimage); // JLabel wala image

       setLayout(null); // the arrange items on frame according to our own and not by default.. by default setting is border layout
       setSize(850,480);  //size of frame
       setLocation(450,200);     // where on the screen frame will be visible,originally it was present at top left corner  (shift 450 from left and 200 from top)
       setUndecorated(true);  // to remove exit, full screen and minimize options from top right corner
        setVisible(true);    // default setting of frame is false that is not visible , change it to visible, it should be at the last because everything above this will be visible
    }

      // when a button is clicked, the action that is performed is stored in  parameter "ActionEvent e"
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
          if(e.getSource()==b1){  // on clicking button1 what action is to be performed
              Con c = new Con();
              String cardno = text2.getText();
              String pin = password3.getText();
              String q = "Select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
              ResultSet resultSet = c.statement.executeQuery(q);  //to get data we use executequery.  data afetr getting fetched is stored in resultset
              if(resultSet.next()){
                  setVisible(false);
                  new main_Class(pin);
              }else{
                  JOptionPane.showMessageDialog(null,"Incorrect Card no. or Pin");
              }
          } else if (e.getSource()==b2) {
              text2.setText("");  // clear all the data entered by user
              password3.setText(""); // clear password
          }
          else if (e.getSource()==b3){
              new Signup();
              setVisible(false);
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
