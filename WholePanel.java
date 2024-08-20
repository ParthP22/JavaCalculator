import javax.swing.*;
import java.awt.*;

public class WholePanel extends JPanel
{
    public WholePanel(){
        this.setBackground(Color.gray);
        this.setFocusable(true);
    }
    public WholePanel(int x, int y, int length, int height){
        this.setBounds(x,y,length,height);
        this.setBackground(Color.gray);
        this.setFocusable(true);
    }
    public WholePanel(int length, int height){
        this.setPreferredSize(new Dimension(length,height));
        this.setBackground(Color.gray);
        this.setFocusable(true);
    }
}   