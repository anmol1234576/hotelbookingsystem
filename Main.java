import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame= new JFrame("HOTEL BOOKING SYSTEM");

        JLabel namelb,emaillb,mobilelb,genderlb,checkinlb, checkoutlb,payementlb, addresslb , bookingid;
        JTextField nametf,emailtf,mobiletf,gendertf,checkintf, checkouttf,payementtf,addresstf;
        JButton bookbutton, clearbutton, exitbutton;



        namelb = new JLabel("Name:-");
        emaillb = new JLabel("Email:-");
        mobilelb = new JLabel("Mobile:-");
        genderlb = new JLabel("Gender:-");
        checkinlb = new JLabel("Checkin:-");
        checkoutlb = new JLabel("Checkout:-");
        payementlb = new JLabel("Payment:-");
        addresslb = new JLabel("Address:-");
        bookingid = new JLabel();

        nametf= new JTextField();
        emailtf= new JTextField();
        mobiletf= new JTextField();
        gendertf= new JTextField();
        checkintf= new JTextField();
        checkouttf= new JTextField();
        payementtf= new JTextField();
        addresstf= new JTextField();

        clearbutton = new JButton("Clear");
        bookbutton = new JButton("Book");
        exitbutton = new JButton("Exit");


        namelb.setBounds(20,30,100,40);
        emaillb.setBounds(20,70,100,40);
        mobilelb.setBounds(20,110,100,40);
        genderlb.setBounds(280,30,100,40);
        checkinlb.setBounds(280,70,100,40);
        checkoutlb.setBounds(280,110,100,40);
        payementlb.setBounds(280,150,100,40);
        addresslb.setBounds(20,150,100,40);
        bookingid.setBounds(50,300,450,40);


        nametf.setBounds(120,30,150,40);
        emailtf.setBounds(120,70,150,40);
        mobiletf.setBounds(120,110,150,40);
        gendertf.setBounds(400,30,150,40);
        checkintf.setBounds(400,70,150,40);
        checkouttf.setBounds(400,110,150,40);
        payementtf.setBounds(400,150,150,40);
        addresstf.setBounds(120,150,150,40);

        clearbutton.setBounds(50,200,150,45);
        bookbutton.setBounds(220,200,150,45);
        exitbutton.setBounds(400,200,150,45);


        frame.add(namelb);
        frame.add(emaillb);
        frame.add(mobilelb);
        frame.add(genderlb);
        frame.add(checkinlb);
        frame.add(checkoutlb);
        frame.add(payementlb);
        frame.add(addresslb);


        frame.add(nametf);
        frame.add(emailtf);
        frame.add(mobiletf);
        frame.add(gendertf);
        frame.add(checkintf);
        frame.add(checkouttf);
        frame.add(payementtf);
        frame.add(addresstf);
        frame.add(bookingid);

        frame.add(clearbutton);
        frame.add(bookbutton);
        frame.add(exitbutton);


        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(600,500);
        frame.setVisible(true);

        clearbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nametf.setText("");
                emailtf.setText("");
                mobiletf.setText("");
                gendertf.setText("");
                checkintf.setText("");
                checkouttf.setText("");
                payementtf.setText("");
                addresstf.setText("");

            }
        });

        bookbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(nametf.getText().toString().isEmpty()|| emailtf.getText().toString().isEmpty()||mobiletf.getText().toString().isEmpty()||gendertf.getText().toString().isEmpty()||checkintf.getText().toString().isEmpty()||checkouttf.getText().toString().isEmpty()||payementtf.getText().toString().isEmpty()||addresstf.getText().toString().isEmpty())
                {
                    bookingid.setText("PLEASE FILL THE DETAILS");
                }
                else {


                    Random random = new Random();
                    int id = random.nextInt(999999);

                    bookingid.setText("YOUR BOOKING IS CONFIRMED AND YOUR BOOKING ID IS :- " + id);
                }
            }
        });
    }
}