import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main{

    public static Image img;
    public static JFrame frame = new JFrame("Image");

    public static void main(String[] args) throws IOException {
        frame.setSize(1080, 1920);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        img = (Image) ImageIO.read(new File(args[0]));
        frame.add(new Img());
        frame.setVisible(true);
    }

    public static class Img extends JPanel {
        @Override
        public void paint(Graphics g) {
            g.drawImage(Main.img, 1, 1, null);
        }
    }
}