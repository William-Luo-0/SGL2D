import javafx.util.Pair;
import model.GenericGame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ErrorFrame extends JFrame {
    private ErrorPanel errorPanel;

    public ErrorFrame(Exception e) {
        super("SGL2D Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(false);
        errorPanel = new ErrorPanel(e);
        add(errorPanel, BorderLayout.CENTER);
        pack();                                 // Size window
        setVisible(true);                       // Make visible
    }

    public static void triggerParseError(String errorMessage) throws Exception {
        throw new Exception(errorMessage);
    }
}
