import Shape_.*;
import Shape_.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 1920);
        frame.add(new Paint());
        frame.setVisible(true);
    }
}