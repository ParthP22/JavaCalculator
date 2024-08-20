import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class CalcFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcFrame extends JFrame
{
    CalcFrame(){
        
        DisplayLabel screenText = new DisplayLabel();
        WholePanel center = new WholePanel(280,380);
        center.setBackground(Color.white);
        center.setLayout(new BorderLayout());
        center.add(new WholePanel(280,10), BorderLayout.CENTER);
        this.setSize(300,400);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.add(new WholePanel(10,400), BorderLayout.WEST);
        this.add(new WholePanel(10,400), BorderLayout.EAST);
        this.add(new WholePanel(280,10), BorderLayout.NORTH);
        this.add(new WholePanel(280,10), BorderLayout.SOUTH);
        this.add(center, BorderLayout.CENTER);
        center.add(new CalcPanel(screenText), BorderLayout.SOUTH);
        center.add(new DisplayPanel(screenText), BorderLayout.NORTH);
        this.setTitle("Parth's Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon icon = new ImageIcon("lmao.jpg");
        this.setIconImage(icon.getImage());
    }
}
