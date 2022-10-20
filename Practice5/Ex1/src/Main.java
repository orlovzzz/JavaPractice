import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static int milanGoals = 0, realGoals = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        JPanel panel = new JPanel();
        String club = "N/A";
        JLabel result = new JLabel("Result: " + milanGoals + " X " + realGoals, JLabel.CENTER);
        JLabel lastScore = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        JLabel winner = new JLabel("Winner: DRAW", JLabel.CENTER);
        panel.add(result);
        panel.add(lastScore);
        panel.add(winner);
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(150,500));
        JButton button = new JButton("AC Milan");
        JButton button1 = new JButton("Real Madrid");
        panel.add(button);
        panel.add(button1);
        frame.getContentPane().add(panel);
        frame.pack();
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditGUI.editResult(result, ++milanGoals, realGoals);
                EditGUI.editLastScore(lastScore, 1);
                EditGUI.editWinner(winner, milanGoals, realGoals);
            }
        };
        button.addActionListener(action);
        ActionListener action1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditGUI.editResult(result, milanGoals, ++realGoals);
                EditGUI.editLastScore(lastScore, 0);
                EditGUI.editWinner(winner, milanGoals, realGoals);
            }
        };
        button1.addActionListener(action1);
        frame.setVisible(true);
    }
}
