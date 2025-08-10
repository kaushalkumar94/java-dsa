import java.awt.*;
import javax.swing.*;

public class test extends JPanel {

    int x1, y1, x2, y2;

    public test(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawDDA(g, x1, y1, x2, y2);
    }

    public void drawDDA(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float xInc = dx / (float) steps;
        float yInc = dy / (float) steps;

        float x = x1;
        float y = y1;

        for (int i = 0; i <= steps; i++) {
            g.fillRect(Math.round(x), Math.round(y), 1, 1); // draw pixel
            x += xInc;
            y += yInc;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DDA Line Drawing Algorithm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Example: line from (50, 50) to (300, 200)
        test panel = new test(50, 50, 300, 200);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
