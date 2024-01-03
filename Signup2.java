package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JButton next;
    JRadioButton r1,r2,e1,e2;
    JTextField textPan,textAadhar;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);  // to make image visible on frame
        image.setBounds(80,10,100,100);  // where on the frame the image will be visible
        add(image); // JLabel wala image

        this.formno=formno; // same formno from previous application form will be passed to the next form

        JLabel l12 = new JLabel(" FORM NO. "); // random number should be present after this heading
        l12.setBounds(500,20,350,40);
        l12.setFont(new Font("Raleway",Font.BOLD,38));
        add(l12);

        JLabel l13 = new JLabel(formno); // random generated form no passed globally
        l13.setBounds(700,20,600,40);
        l13.setFont(new Font("Raleway",Font.BOLD,38));
        add(l13);

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(330,70,600,30);
        add(l1);

        JLabel l2 = new JLabel("Additional Details: ");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(270,100,600,30);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(100,170,100,30);
        add(l3);

        String religion[]= {"Hindu","Sikh","Christian","Muslim","Others"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(186, 125, 246));
        comboBox.setBounds(350,170,300,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,230,100,30);
        add(l4);

        String Category[]= {"General","OBC","ST","SC","Others"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(186, 125, 246));
        comboBox2.setBounds(350,230,300,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(100,290,100,30);
        add(l5);

        String income[]= {" Null"," <1,50,000"," <2,50,000"," <5,00,000"," upto 10,00,000","above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(186, 125, 246));
        comboBox3.setBounds(350,290,300,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(100,340,200,60);
        add(l6);

        JLabel q = new JLabel("Qualification ");
        q.setFont(new Font("Raleway",Font.BOLD,20));
        q.setBounds(100,360,200,60);
        add(q);

        String educational[]= {"Graduate","Non-Graduate","Post-Graduate","Doctorate"," Other"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(186, 125, 246));
        comboBox4.setBounds(350,350,300,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(100,410,150,60);
        add(l7);

        String Occupation[]= {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(186, 125, 246));
        comboBox5.setBounds(350,420,300,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(100,470,150,60);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.PLAIN,14));
        textPan.setBounds(350,480,300,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number :");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(100,530,200,60);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.PLAIN,14));
        textAadhar.setBounds(350,540,300,30);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(100,590,200,60);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.PLAIN,14));
        r1.setBackground(new Color(204,153,255));
        r1.setBounds(350,600,60,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.PLAIN,14));
        r2.setBackground(new Color(204,153,255));
        r2.setBounds(450,600,60,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();  // only one out of two option will be selected
        buttonGroup.add(r1);  //it is called "group by method
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,650,250,60);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.PLAIN,14));
        e1.setBackground(new Color(204,153,255));
        e1.setBounds(350,660,60,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.PLAIN,14));
        e2.setBackground(new Color(204,153,255));
        e2.setBounds(450,660,60,30);
        add(e2);

        ButtonGroup buttonGroup1 = new ButtonGroup();  // only one out of two option will be selected
        buttonGroup1.add(e1);  //it is called "group by method
        buttonGroup1.add(e2);

        next = new JButton("NEXT ");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setForeground(Color.BLACK);  //color of text
        next.setBackground(Color.getHSBColor(102,102,153));
        next.setBounds(700,700,120,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
       setSize(850,780);
       setLocation(360,30);
       getContentPane().setBackground(new Color(204,153,255));
       setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        String pan = textPan.getText();
        String aadhar = textAadhar.getText();
        String scitizen = null;  // can also be written as scitizen = " ";
        if((r1.isSelected())){
            scitizen = "Yes";
        }
        else if((r2.isSelected())){
            scitizen = "No";
        }
        String eAccount = " ";
        if((e1.isSelected())){
            eAccount="Yes";
        } else if ((e2.isSelected())) {
            eAccount = "No";
        }

        try{
            if(textPan.getText().equals("")|| textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else{
                Con c1 = new Con();
                // variables name same as initialized above and not with the ones in database
                String q = "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q); // to insert values we use executeUpdate
                new Signup3(formno);
                setVisible(false);


            }

        }
        catch(Exception E ){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Signup2("");
    }
}
