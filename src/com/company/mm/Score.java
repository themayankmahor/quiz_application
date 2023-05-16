package com.company.mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {

    //
    JButton button_playAgain;

    //
    Score(String name, int score)
    {
        //
        getContentPane().setBackground(Color.WHITE);
        //
        setLayout(null);
        //
        int frameWidth = 750;
        int frameHeight = 550;

        ///
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        //
        JLabel text_heading = new JLabel("Thank You " + name + " for playing Simple Minds");
        text_heading.setBounds(45, 30, 700, 30);
        text_heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(text_heading);

        //
        JLabel text_score = new JLabel("Your score is " + score);
        text_score.setBounds(350, 200, 300, 30);
        text_score.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(text_score);

        //

        button_playAgain = new JButton("Play Again");
        button_playAgain.setBounds(400, 270, 150, 30);
        button_playAgain.setFont(new Font("Tahoma", Font.PLAIN, 22));
        button_playAgain.setBackground(new Color(30, 144, 255));
        button_playAgain.setForeground(Color.WHITE);
        button_playAgain.addActionListener(this);
        add(button_playAgain);

        //
        setSize(frameWidth, frameHeight);
        //
        setLocationRelativeTo(null);
        //
        setVisible(true);
    }


    //
    public void actionPerformed(ActionEvent ae)
    {
        //
        if (ae.getSource() == button_playAgain)
        {
            //
            setVisible(false);
            //
            new Login();
        }
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
