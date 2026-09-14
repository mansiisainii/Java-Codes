import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class pigGui extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Smoother drawing
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Background
        g2.setColor(new Color(220, 240, 255));
        g2.fillRect(0, 0, getWidth(), getHeight());

        // Pig colors
        Color pigPink = new Color(255, 182, 193);
        Color pigDeepPink = new Color(255, 105, 180);
        Color snoutPink = new Color(255, 160, 180);
        Color eyeWhite = new Color(255, 255, 255);

        // Body
        g2.setColor(pigPink);
        g2.fillOval(100, 180, 220, 120); // Body

        // Head
        g2.fillOval(145, 110, 130, 100); // Head

        // Ears
        Polygon leftEar = new Polygon(new int[]{160, 175, 190}, new int[]{120, 70, 120}, 3);
        Polygon rightEar = new Polygon(new int[]{230, 245, 260}, new int[]{120, 70, 120}, 3);
        g2.fillPolygon(leftEar);
        g2.fillPolygon(rightEar);

        // Eyes
        g2.setColor(eyeWhite);
        g2.fillOval(175, 140, 20, 15);
        g2.fillOval(215, 140, 20, 15);
        g2.setColor(Color.BLACK);
        g2.fillOval(182, 144, 6, 6);
        g2.fillOval(222, 144, 6, 6);

        // Snout
        g2.setColor(snoutPink);
        g2.fillOval(185, 160, 50, 25);
        g2.setColor(Color.BLACK);
        g2.fillOval(195, 167, 6, 10);
        g2.fillOval(220, 167, 6, 10);

        // Legs
        g2.setColor(pigPink);
        g2.fillRect(130, 290, 20, 40);
        g2.fillRect(250, 290, 20, 40);
        g2.setColor(Color.BLACK);
        g2.fillRect(130, 325, 20, 10);
        g2.fillRect(250, 325, 20, 10);

        // Tail (curly)
        g2.setColor(pigDeepPink);
        int centerX = 100, centerY = 240;
        QuadCurve2D q1 = new QuadCurve2D.Float(centerX, centerY, centerX - 20, centerY - 10, centerX, centerY - 20);
        QuadCurve2D q2 = new QuadCurve2D.Float(centerX, centerY - 20, centerX + 20, centerY - 30, centerX, centerY - 40);
        g2.draw(q1);
        g2.draw(q2);

        // Label (comment/message)
        g2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        g2.setColor(new Color(80, 20, 20));
        g2.drawString("MEET  DHOKEBAAZ GADDAR JHUTA SUAR", 130, 380);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Realistic Pig GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setUndecorated(true);                    

        frame.add(new pigGui());
        frame.setVisible(true);
    }
}