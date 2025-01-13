import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //instantiate a rockPaperScissors obj
                rockPaperScissorsGui rockPaperScissorsGui = new rockPaperScissorsGui();

                //display the GUI
                rockPaperScissorsGui.setVisible(true);
            }
        });
    }
}
