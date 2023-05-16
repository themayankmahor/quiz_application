package com.company.mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener {

    //
    JLabel text_questionNo, text_question;

    //
    JButton button_next, button_lifeLine, button_submit;

    //
    JRadioButton radioButton_option1, radioButton_option2, radioButton_option3, radioButton_option4;
    //
    ButtonGroup buttonGroup_options;

    //
    public static int timer = 15;
    public static int gameTime = timer;
    //
    public static int answerGiven = 0;
    //
    public static int count = 0;
    //
    public static int score = 0;

    //
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String userAnswers[][] = new String[10][1];

    //
    String name;

    //
    Quiz(String name)
    {
        this.name = name;
        int frameWidth = 1350;
        int frameHeight = 720;
        //
        getContentPane().setBackground(Color.WHITE);
        //
        setLayout(null);


        ///
        ImageIcon imageIcon_quiz = new ImageIcon(ClassLoader.getSystemResource("icon/quiz.jpg"));
        //
        JLabel image_quiz = new JLabel(imageIcon_quiz);
        image_quiz.setBounds(0, 0, frameWidth, frameHeight/2);
        add(image_quiz);


        //
        text_questionNo = new JLabel();
        text_questionNo.setBounds(100, 405, 50, 30);
        text_questionNo.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(text_questionNo);

        //
        text_question = new JLabel();
        text_question.setBounds(150, 405, 900, 30);
        text_question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(text_question);

        ///Questions
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        ///Answers
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";


        //
        radioButton_option1 = new JRadioButton();
        radioButton_option1.setBounds(170, 460, 700, 30);
        radioButton_option1.setBackground(Color.WHITE);
        radioButton_option1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(radioButton_option1);

        //
        radioButton_option2 = new JRadioButton();
        radioButton_option2.setBounds(170, 500, 700, 30);
        radioButton_option2.setBackground(Color.WHITE);
        radioButton_option2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(radioButton_option2);

        //
        radioButton_option3 = new JRadioButton();
        radioButton_option3.setBounds(170, 540, 700, 30);
        radioButton_option3.setBackground(Color.WHITE);
        radioButton_option3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(radioButton_option3);

        //
        radioButton_option4 = new JRadioButton();
        radioButton_option4.setBounds(170, 580, 700, 30);
        radioButton_option4.setBackground(Color.WHITE);
        radioButton_option4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(radioButton_option4);

        //
        buttonGroup_options = new ButtonGroup();
        buttonGroup_options.add(radioButton_option1);
        buttonGroup_options.add(radioButton_option2);
        buttonGroup_options.add(radioButton_option3);
        buttonGroup_options.add(radioButton_option4);

        //
        button_next = new JButton("Next");
        button_next.setBounds(1110, 500, 200, 30);
        button_next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        button_next.setBackground(new Color(30, 144, 255));
        button_next.addActionListener(this);
        button_next.setForeground(Color.WHITE);
        add(button_next);

        //
        button_lifeLine = new JButton("50-50 Life Line");
        button_lifeLine.setBounds(1110, 560, 200, 30);
        button_lifeLine.setFont(new Font("Tahoma", Font.PLAIN, 22));
        button_lifeLine.setBackground(new Color(30, 144, 255));
        button_lifeLine.setForeground(Color.WHITE);
        button_lifeLine.addActionListener(this);
        add(button_lifeLine);

        //
        button_submit = new JButton("Submit");
        button_submit.setBounds(1110, 620, 200, 30);
        button_submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        button_submit.setBackground(new Color(30, 144, 255));
        button_submit.setForeground(Color.WHITE);
        button_submit.setEnabled(false);
        button_submit.addActionListener(this);
        add(button_submit);

        //
        start(count);

        //
        setSize(frameWidth, frameHeight);
        //
        setLocationRelativeTo(null);

        //
        setVisible(true);
    };

    ///
    public void paint(Graphics g)
    {
        super.paint(g);

        //
        String time = "Time Left  " + timer+ " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));



        //
        if (timer > 0)
        {
            g.drawString(time, 1050, 470);
        }
        else
        {
            g.drawString("Times Up!!!", 1050, 470);
        }

        //
        timer--;

        //
        try {
            //
            Thread.sleep(1000);
            repaint();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        //
        if (answerGiven == 1)
        {
            //
            answerGiven = 0;
            //
            timer = gameTime;
        }
        else if (timer < 0)
        {
            //
            timer = gameTime;

            //
            radioButton_option1.setEnabled(true);
            radioButton_option2.setEnabled(true);
            radioButton_option3.setEnabled(true);
            radioButton_option4.setEnabled(true);

            //
            if (count == questions.length - 2)
            {
                //
                button_next.setEnabled(false);
                //
                button_submit.setEnabled(true);
            }
            //
            if (count == questions.length - 1)
            {
                //
                if (buttonGroup_options.getSelection() == null)
                {
                    userAnswers[count][0] = "";
                }
                else
                {
                    userAnswers[count][0] = buttonGroup_options.getSelection().getActionCommand();
                }

                //
                for (int i = 0; i < userAnswers.length; i++)
                {
                    //
                    if (userAnswers[i][0] == answers[i][1])
                    {
                        score += 10;
                    }
                }

                //
                setVisible(false);

                //
                new Score(name, score);
            }
            else
            {
                //
                if (buttonGroup_options.getSelection() == null)
                {
                    userAnswers[count][0] = "";
                }
                else
                {
                    userAnswers[count][0] = buttonGroup_options.getSelection().getActionCommand();
                }

                //
                count++;
                //
                start(count);
            }
        }
    }


    ////
    public void start(int count)
    {
        text_questionNo.setText(""+ (count+1)+ ". ");
        text_question.setText(""+ questions[count][0]);
        radioButton_option1.setText("" + questions[count][1]);
        radioButton_option1.setActionCommand(questions[count][1]);
        //
        radioButton_option2.setText("" + questions[count][2]);
        radioButton_option2.setActionCommand(questions[count][2]);
        //
        radioButton_option3.setText("" + questions[count][3]);
        radioButton_option3.setActionCommand(questions[count][3]);
        //
        radioButton_option4.setText("" + questions[count][4]);
        radioButton_option4.setActionCommand(questions[count][4]);

        //
        buttonGroup_options.clearSelection();
    };

    ///
    public void actionPerformed(ActionEvent ae)
    {
        //
        if (ae.getSource() == button_next)
        {
            //
            repaint();

            //
            //
            radioButton_option1.setEnabled(true);
            radioButton_option2.setEnabled(true);
            radioButton_option3.setEnabled(true);
            radioButton_option4.setEnabled(true);

            //
            answerGiven = 1;

            //
            if (buttonGroup_options.getSelection() == null)
            {
                userAnswers[count][0] = "";
            }
            else
            {
                userAnswers[count][0] = buttonGroup_options.getSelection().getActionCommand();
            }

            //
            if (count == questions.length - 2)
            {
                //
                button_next.setEnabled(false);
                //
                button_submit.setEnabled(true);
            }

            //
            count++;
            start(count);
        }
        else if (ae.getSource() == button_lifeLine)
        {
            //
            if (count == 2 || count == 4 || count == 6 || count == 8)
            {
                radioButton_option2.setEnabled(false);
                radioButton_option3.setEnabled(false);
            }
            else
            {
                radioButton_option1.setEnabled(false);
                radioButton_option4.setEnabled(false);
            }
            //
            button_lifeLine.setEnabled(false);
        }
        else
        {

            //
            answerGiven = 1;

            //
            if (buttonGroup_options.getSelection() == null)
            {
                userAnswers[count][0] = "";
            }
            else
            {
                userAnswers[count][0] = buttonGroup_options.getSelection().getActionCommand();
            }

            //
            for (int i = 0; i < userAnswers.length; i++)
            {
                //
                if (userAnswers[i][0] == answers[i][1])
                {
                    score += 10;
                }
            }

            //
            setVisible(false);
            new Score(name, score);
        }
    }

    public static void main(String[] args) {
        new Quiz("User");
    }
}
