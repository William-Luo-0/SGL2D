import model.GenericGame;

import javax.swing.*;
import java.awt.*;

public class ErrorPanel extends JPanel {
    private static final int ERROR_WIDTH = 1280;
    private static final int ERROR_HEIGHT = 100;
    private String errorMessage;

    /**
     * Panel to display Exception
     * @param e the exception to display
     */
    public ErrorPanel (Exception e) {
        setPreferredSize(new Dimension(ERROR_WIDTH, ERROR_HEIGHT));
        setBackground(Color.BLACK);
        errorMessage = e.getMessage();
        JLabel errorLabel = new JLabel(errorMessage);
        errorLabel.setPreferredSize(new Dimension(ERROR_WIDTH, ERROR_HEIGHT));
        errorLabel.setForeground(Color.WHITE);
        add(errorLabel);
        errorLabel.setVisible(true);
    }
}
