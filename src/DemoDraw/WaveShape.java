package DemoDraw;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class WaveShape implements GridShape{
    @Override
    public void draw(Graphics2D g2d, JComponent parent) {
        g2d.setColor(Color.RED);

        int xDiff = parent.getWidth()/4;
        int height = parent.getHeight() - 1;

        int xPos = 0;

        GeneralPath path = new GeneralPath();
        path.moveTo(0, 0);
        path.curveTo(xPos + xDiff, 0, xPos, height, xPos + xDiff, height);
        xPos += xDiff;
        path.curveTo(xPos + xDiff, height, xPos, 0, xPos + xDiff, 0);
        xPos += xDiff;
        path.curveTo(xPos + xDiff, 0, xPos, height, xPos + xDiff, height);
        xPos += xDiff;
        path.curveTo(xPos + xDiff, height, xPos, 0, xPos + xDiff, 0);
        g2d.draw(path);

    }
}
