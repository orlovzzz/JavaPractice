import javax.swing.*;
import java.net.URL;

public class Main {
    public static void main(String args[]) {
        URL img = Main.class.getResource("123.gif");
        Icon icon = new ImageIcon(img);
        JLabel gif = new JLabel(icon);
        JFrame frame = new JFrame("Animation");
        frame.add(gif);
        frame.setSize(600,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}