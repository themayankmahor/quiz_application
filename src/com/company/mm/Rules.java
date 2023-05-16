package com.company.mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    //
    JButton button_start, button_back;

    //
    String name;
    //
    Rules(String name)
    {
        this.name = name;

        //set background color
        getContentPane().setBackground(Color.WHITE);
        //
        setLayout(null);
        //
        int frameWidth = 800;
        int frameHeight = 650;

        //
        JLabel text_heading = new JLabel("Welcome " +name+ " to Simple Minds");
        text_heading.setBounds(50, 20, 700, 30);
        text_heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 28));
        text_heading.setForeground(new Color(30, 144, 254));
        add(text_heading);

        //
        JLabel text_rules = new JLabel();
        text_rules.setBounds(20, 90, 700, 350);
        text_rules.setFont(new Font("Tahoma",Font.PLAIN, 16));
        text_rules.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"
        );
        add(text_rules);


        //
        button_start = new JButton("Start");
        button_start.setBounds(400, 500, 100, 30);
        button_start.setBackground(new Color(30,144, 254));
        button_start.setForeground(Color.WHITE);
        button_start.addActionListener(this);
        add(button_start);

        //
        button_back = new JButton("Back");
        button_back.setBounds(250, 500, 100, 30);
        button_back.setBackground(new Color(30,144, 254));
        button_back.setForeground(Color.WHITE);
        button_back.addActionListener(this);
        add(button_back);

        //set frame size
        setSize(frameWidth, frameHeight);
        //set location
        setLocation(300, 50);
        //
        setVisible(true);
    }

    //
    public void actionPerformed(ActionEvent ae)
    {
        //
        if (ae.getSource() == button_start)
        {
            //
            setVisible(false);

            //
            new Quiz(name);
        }
        else
        {
            //
            setVisible(false);
            //
            new Login();

        }
    };

    public static void main(String[] args) {
        new Rules("User");
    }
}
