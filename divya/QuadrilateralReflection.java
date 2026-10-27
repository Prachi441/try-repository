import java.awt.*;
import javax.swing.*;

public class QuadrilateralReflection extends JPanel {

    int x[] = {100, 200, 180, 120};
    int y[] = {100, 100, 180, 200};

    int xr[] = new int[4];
    int yr[] = new int[4];

    int xr2[] = new int[4];
    int yr2[] = new int[4];

    public QuadrilateralReflection() {

        // Reflection about X-axis
        for (int i = 0; i < 4; i++) {
            xr[i] = x[i];
            yr[i] = -y[i] + 400; // shifting to make visible
        }

        // Reflection about Y-axis
        for (int i = 0; i < 4; i++) {
            xr2[i] = -x[i] + 400; // shifting to make visible
            yr2[i] = y[i];
        }
    }

    public void paint(Graphics g) {

        g.setColor(Color.PINK);
        g.drawPolygon(x, y, 4); // Original Quadrilateral

        g.setColor(Color.BLACK);
        g.drawPolygon(xr, yr, 4); // Reflection about X-axis

        g.setColor(Color.GREEN);
        g.drawPolygon(xr2, yr2, 4); // Reflection about Y-axis
    }

    public static void main(String args[]) {

        JFrame f = new JFrame("Quadrilateral Reflection");

        QuadrilateralReflection obj = new QuadrilateralReflection();
        f.add(obj);

        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}