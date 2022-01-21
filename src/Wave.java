import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Wave extends JLabel {

    private int counter = 0;

    public Wave() {
        setText("Surf the wave bro");
        ImageIcon icon = new ImageIcon("src/res/OIP-removebg-preview-removebg-preview.png");
        setIcon(icon);
        setHorizontalTextPosition(JLabel.CENTER);
        setVerticalTextPosition(JLabel.TOP);
        setForeground(new Color(0x0d92cd));
        setFont(new Font("MV Boli",Font.PLAIN,50));
        setIconTextGap(5);
        setBackground(new Color(0xFFFFFF));
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(new Color(0x0d92cd),10));

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton()==MouseEvent.BUTTON3){
                    setText("Surf the wave again!");
                    counter = 0;
                }else {
                    counter++;
                    setText(String.valueOf(counter));
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(Color.WHITE);
            }
        });
    }
}
