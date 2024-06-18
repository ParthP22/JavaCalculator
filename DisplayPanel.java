import javax.swing.*;
import java.awt.*;
public class DisplayPanel extends JPanel
{
    public DisplayPanel(DisplayLabel screen){
        this.setPreferredSize(new Dimension(280,50));
        this.setBackground(Color.white);
        this.setFocusable(true);
        this.add(screen);
    }
}