import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcPanel extends JPanel 
{
    public CalcPanel(DisplayLabel screen){
        this.setPreferredSize(new Dimension(280,340));
        
        this.setBackground(Color.black);
        this.setFocusable(true);
        //this.addKeyListener();
        this.setLayout(new GridLayout(4,4,10,10));
        
        JButton button1 = new JButton("1");
        button1.addActionListener(e -> screen.add('1'));
        button1.setBackground(new Color(0,0,50));
        button1.setForeground(Color.lightGray);
        button1.setBorder(BorderFactory.createEtchedBorder());
        
        JButton button2 = new JButton("2");
        button2.addActionListener(e -> screen.add('2'));
        button2.setBackground(new Color(0,0,50));
        button2.setForeground(Color.lightGray);
        button2.setBorder(BorderFactory.createEtchedBorder());
        
        JButton button3 = new JButton("3");
        button3.addActionListener(e -> screen.add('3'));
        button3.setBackground(new Color(0,0,50));
        button3.setForeground(Color.lightGray);
        button3.setBorder(BorderFactory.createEtchedBorder());
        
        JButton plusButton = new JButton("+");
        plusButton.addActionListener(e -> screen.add('+'));
        plusButton.setBackground(new Color(0,0,50));
        plusButton.setForeground(Color.lightGray);
        plusButton.setBorder(BorderFactory.createEtchedBorder());
    
        JButton button4 = new JButton("4");
        button4.addActionListener(e -> screen.add('4'));
        button4.setBackground(new Color(0,0,50));
        button4.setForeground(Color.lightGray);
        button4.setBorder(BorderFactory.createEtchedBorder());
        
        JButton button5 = new JButton("5");
        button5.addActionListener(e -> screen.add('5'));
        button5.setBackground(new Color(0,0,50));
        button5.setForeground(Color.lightGray);
        button5.setBorder(BorderFactory.createEtchedBorder());
        
        JButton button6 = new JButton("6");
        button6.addActionListener(e -> screen.add('6'));
        button6.setBackground(new Color(0,0,50));
        button6.setForeground(Color.lightGray);
        button6.setBorder(BorderFactory.createEtchedBorder());
        
        JButton minusButton = new JButton("-");
        minusButton.addActionListener(e -> screen.add('-'));
        minusButton.setBackground(new Color(0,0,50));
        minusButton.setForeground(Color.lightGray);
        minusButton.setBorder(BorderFactory.createEtchedBorder());
        
        JButton button7 = new JButton("7");
        button7.addActionListener(e -> screen.add('7'));
        button7.setBackground(new Color(0,0,50));
        button7.setForeground(Color.lightGray);
        button7.setBorder(BorderFactory.createEtchedBorder());
        
        JButton button8 = new JButton("8");
        button8.addActionListener(e -> screen.add('8'));
        button8.setBackground(new Color(0,0,50));
        button8.setForeground(Color.lightGray);
        button8.setBorder(BorderFactory.createEtchedBorder());
        
        JButton button9 = new JButton("9");
        button9.addActionListener(e -> screen.add('9'));
        button9.setBackground(new Color(0,0,50));
        button9.setForeground(Color.lightGray);
        button9.setBorder(BorderFactory.createEtchedBorder());
        
        JButton multiplyButton = new JButton("x");
        multiplyButton.addActionListener(e -> screen.add('*'));
        multiplyButton.setBackground(new Color(0,0,50));
        multiplyButton.setForeground(Color.lightGray);
        multiplyButton.setBorder(BorderFactory.createEtchedBorder());
        
        JButton button0 = new JButton("0");
        button0.addActionListener(e -> screen.add('0'));
        button0.setBackground(new Color(0,0,50));
        button0.setForeground(Color.lightGray);
        button0.setBorder(BorderFactory.createEtchedBorder());
        
        JButton clearButton = new JButton("Clr");
        clearButton.addActionListener(e -> screen.clear());
        clearButton.setBackground(new Color(0,0,50));
        clearButton.setForeground(Color.lightGray);
        clearButton.setBorder(BorderFactory.createEtchedBorder());
        
        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener(e -> screen.answer());
        equalsButton.setBackground(new Color(0,0,50));
        equalsButton.setForeground(Color.lightGray);
        equalsButton.setBorder(BorderFactory.createEtchedBorder());
        
        JButton divideButton = new JButton("/");
        divideButton.addActionListener(e -> screen.add('/'));
        divideButton.setBackground(new Color(0,0,50));
        divideButton.setForeground(Color.lightGray);
        divideButton.setBorder(BorderFactory.createEtchedBorder());
        
        
        
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(plusButton);
        
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(minusButton);
        
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.add(multiplyButton);
        
        this.add(button0);
        this.add(clearButton);
        this.add(equalsButton);
        this.add(divideButton);
    }
}
