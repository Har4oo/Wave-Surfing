
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Simple {
    JFrame frame;
    JLabel label;
    Border border;

    Simple() {
        frame = new JFrame();
        label = new Wave();
        frame.setLayout(new FlowLayout());
        border = BorderFactory.createLineBorder(new Color(0x0d92cd),10);
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
    }
}  