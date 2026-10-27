import javax.swing.*;
import java.awt.*;

public class DrawMan extends JFrame {

    public DrawMan() {
        setTitle("Draw a Man");
        setSize(400, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Head
        g.drawOval(150, 80, 100, 100); // circle for head

        // Eyes
        g.drawOval(175, 110, 15, 15);
        g.drawOval(210, 110, 15, 15);

        // Mouth
        g.drawArc(180, 130, 40, 20, 0, -180);

        // Body
        g.drawRect(170, 180, 60, 120); // rectangle body

        // Arms
        g.drawLine(170, 200, 130, 250); // left arm
        g.drawLine(230, 200, 270, 250); // right arm

        // Hands
        g.drawOval(120, 245, 20, 20);
        g.drawOval(270, 245, 20, 20);

        // Legs
        g.drawLine(185, 300, 160, 380); // left leg
        g.drawLine(215, 300, 240, 380); // right leg

        // Feet
        g.drawOval(145, 380, 30, 15);
        g.drawOval(230, 380, 30, 15);
    }

    public static void main(String[] args) {
        new DrawMan();
    }
}
