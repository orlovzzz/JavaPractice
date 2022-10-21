import Shape_.Circle;
import Shape_.Rectangle;
import Shape_.Shape1;
import Shape_.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Paint extends JPanel {
    private Random random = new Random();

    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        for (int i = 0; i < 20; i++) {
            Shape1 obj;
            int k = 1 + random.nextInt(3);
            switch (k) {
                case (1):
                    Circle obj1 = new Circle(50 + random.nextInt(100), new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()), random.nextBoolean());
                    gr.setColor(obj1.getColor());
                    if (obj1.isFilled() == true) {
                        g.fillOval(1 + random.nextInt(950), 1 + random.nextInt(500), (int)obj1.getRadius(), (int)obj1.getRadius());
                    } else {
                        g.drawOval(1 + random.nextInt(950), 1 + random.nextInt(500), (int)obj1.getRadius(), (int)obj1.getRadius());
                    }
                    break;
                case (2):
                    Rectangle rect = new Rectangle(50 + random.nextInt(100), 50 + random.nextInt(100), new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()), random.nextBoolean());
                    gr.setColor(rect.getColor());
                    if (rect.isFilled() == true) {
                        g.fillRect(1 + random.nextInt(950), 1 + random.nextInt(500), (int)rect.getWidth(), (int)rect.getLength());
                    } else {
                        g.drawRect(1 + random.nextInt(950), 1 + random.nextInt(500), (int)rect.getWidth(), (int)rect.getLength());
                    }
                    break;
                case (3):
                    int n = 50 + random.nextInt(100);
                    Square square = new Square(n, new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()), random.nextBoolean());
                    gr.setColor(square.getColor());
                    if (square.isFilled() == true) {
                        g.fillRect(1 + random.nextInt(950), 1 + random.nextInt(500), (int)square.getWidth(), (int)square.getLength());
                    } else {
                        g.fillRect(1 + random.nextInt(950), 1 + random.nextInt(500), (int)square.getWidth(), (int)square.getLength());
                    }
                    break;
            }
        }
    }
}

