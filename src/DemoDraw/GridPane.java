package DemoDraw;

import javax.swing.*;
import java.awt.*;

public class GridPane extends JPanel {
    private WaveShape waveShape;

    public GridPane() {
        waveShape = new WaveShape();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
//        g2d.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
        g2d.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        g2d.dispose();

        // I don't trust you
        g2d = (Graphics2D) g.create();
        waveShape.draw(g2d, this);
        g2d.dispose();
    }

}
