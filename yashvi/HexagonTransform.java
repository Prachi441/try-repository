import java.awt.*;
import javax.swing.*;

public class HexagonTransform extends JPanel {

    int x[] = {100, 150, 200, 200, 150, 100};
    int y[] = {100, 50, 100, 170, 220, 170};

    int xs[] = new int[6];
    int ys[] = new int[6];

    int xr[] = new int[6];
    int yr[] = new int[6];

    public HexagonTransform() {

        // Scaling factor (enlarge)
        int sx = 2;
        int sy = 2;

        for (int i = 0; i < 6; i++) {
            xs[i] = x[i] * sx;
            ys[i] = y[i] * sy;
        }

        // Rotation by 90 degrees
        double angle = Math.toRadians(90);

        for (int i = 0; i < 6; i++) {
            xr[i] = (int)(xs[i] * Math.cos(angle) - ys[i] * Math.sin(angle));
            yr[i] = (int)(xs[i] * Math.sin(angle) + ys[i] * Math.cos(angle));
        }
    }

    public void paint(Graphics g) {

        g.setColor(Color.BLUE);
        g.drawPolygon(x, y, 6); // Original Hexagon

        g.setColor(Color.GREEN);
        g.drawPolygon(xs, ys, 6); // Enlarged Hexagon

        g.setColor(Color.RED);
        g.drawPolygon(xr, yr, 6); // Rotated Hexagon (90°)
    }

    public static void main(String args[]) {

        JFrame frame = new JFrame("Hexagon Scaling and Rotation");
        HexagonTransform obj = new HexagonTransform();

        frame.add(obj);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}