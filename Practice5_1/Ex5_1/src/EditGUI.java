import javax.swing.*;

public class EditGUI {
    public static void editResult(JLabel label, int milanGoals, int realGoals) {
        label.setText("Result: " + milanGoals + " X " + realGoals);
    }

    public static void editLastScore(JLabel lastScore, int flag) {
        if (flag == 1) {
            lastScore.setText("Last Scorer: AC Milan.");
        } else {
            lastScore.setText("Last Scorer: Real Madrid.");
        }
    }

    public static void editWinner(JLabel winner, int milanGoals, int realGoals) {
        if (milanGoals < realGoals) {
            winner.setText("Winner: Real Madrid");
        } else if (milanGoals > realGoals) {
            winner.setText("Winner: AC Milan");
        } else {
            winner.setText("Winner: DRAW");
        }
    }
}
