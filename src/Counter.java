import javax.swing.*;
import java.awt.*;

public class Counter extends JLabel {
    private int counter = 0;
    public Counter(){
        setText(String.valueOf(counter));
        setForeground(new Color(0x0d92cd));
        setFont(new Font("MV Boli",Font.PLAIN,50));
        setIconTextGap(5);
        setOpaque(true);
    }
}
