package com.company.mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    //
    JButton button_rules, button_back;

    //
    JTextField textField_name;

    //Constructor
    Login()
    {
        //
        setLayout(null);

        //frame size
        int frameWidth = 1200;
        int frameHeight = 500;

        ///
        ImageIcon imageIcon_login = new ImageIcon(ClassLoader.getSystemResource("icon/login.jpeg"));

        //
        JLabel image_login = new JLabel(imageIcon_login);
        image_login.setBounds(0, 0, frameWidth/2, frameHeight);
        add(image_login);

        //
        JLabel text_heading = new JLabel("Simple Minds");
        text_heading.setBounds(750, 60, 300, 45);
        text_heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 40));
        text_heading.setForeground(new Color(30, 144, 254));
        add(text_heading);

        //
        JLabel text_name = new JLabel("Enter your name");
        text_name.setBounds(810, 150, 300, 20);
        text_name.setFont(new Font("Mongolian Baiti",Font.BOLD, 18));
        text_name.setForeground(new Color(30, 144, 254));
        add(text_name);

        //
        textField_name = new JTextField();
        textField_name.setBounds(735, 200, 300, 25);
        textField_name.setFont(new Font("Times New Roman", Font.BOLD, 20));
        textField_name.setForeground(Color.BLACK);
        add(textField_name);

        //
        button_rules = new JButton("Rules");
        button_rules.setBounds(735, 270, 120, 25);
        button_rules.setBackground(new Color(30,144, 254));
        button_rules.setForeground(Color.WHITE);
        button_rules.addActionListener(this);
        add(button_rules);

        //
        button_back = new JButton("Back");
        button_back.setBounds(915, 270, 120, 25);
        button_back.setBackground(new Color(30,144, 254));
        button_back.setForeground(Color.WHITE);
        button_back.addActionListener(this);
        add(button_back);

        //set bg white
        getContentPane().setBackground(Color.WHITE);

        //set frame size
        setSize(frameWidth, frameHeight);
        //set frame location (to center of screen)
        setLocationRelativeTo(null);
        //set visibility -> true
        setVisible(true);
    }

    //
    public void actionPerformed(ActionEvent ae)
    {
        //
        if (ae.getSource() == button_rules)
        {
            //get name
            String name = textField_name.getText();
            //
            setVisible(false);
            //
            new Rules(name);

        }else if (ae.getSource() == button_back)
        {
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new Login();
    }
}
