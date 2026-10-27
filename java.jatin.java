Import java.awt.*;
javax.swing.*;
Public class DrawMan extends Jpanel {
    public void paint Component(Graphics g) {
        super .paintComponent (g);
        // herad (circle)
        g.drawOval(220,80,80,80);

        // Eyes (small Circle)
        g.drawoval(240,110,10,10);
        g.drawOval(270,110,10,10);

        // mouth (lines)
        g.drawlines(245,140,275,140);

        //Body (line)
        g.drawlines(260,160,260,280);

        //Arms (lines)
        g.drawline(260,190,210,230);   // Left

        g.dwawline(260,190,310,340);   // Right

        // Legs (lines)
        g.drawline(260,280,220,340);  // Left

        g.drawline(260,280,300,340);  //Right

        //hat (rectangle)
        g.drawline(230,60,60,20);
        
        //hat top (triangle)
        int x[] = {230,260,290};
        int y[] = {60,30,60};
        g.drawPloygon(x ,y ,z);
    }

        public static void main(string[] args) {
            JFrame frame = new JFrame("Draw Man");
            drawman Panel = new DrawMan();

            Frame.add(panel);
            Frame.setsize(500,500);
       frame.setdefaultcloseoperation(JFrame.Exit_on_Close);
        Frame.setvisible(true) ;
        }
    }      
