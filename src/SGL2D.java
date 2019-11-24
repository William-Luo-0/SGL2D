import javafx.util.Pair;
import model.GenericGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

public class SGL2D extends JFrame {

    private GenericGame game;
    private GamePanel gamePanel;
    private CounterPanel counterPanel;

    // Future Implementations:
    // Use timer from Javax.Swing.Timer to create tick based games, initialize timer to set default update cycle

    /**
     * SGL2D Game Frame Initializer
     */
    public SGL2D(String filePath) throws IOException {
        super("SGL2D Game");                       // JFrame frame = new JFrame("Frame Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(false);                  // Will display window bar
        GameFactory gameFactory = new GameFactory();
        Pair<GenericGame, ArrayList<Boolean>> gameFactoryOutput = gameFactory.createGame(filePath);
        game = gameFactoryOutput.getKey();
        gamePanel = new GamePanel(game);        // Create game JPanel
        counterPanel = new CounterPanel(game,
                gameFactoryOutput.getValue().get(0),
                gameFactoryOutput.getValue().get(1),
                gameFactoryOutput.getValue().get(2));  // Create counter JPanel
        game.addObserver(counterPanel);         // Add counter to observe game
        add(gamePanel);                         // Defaults to fill rest of frame (center)
        add(counterPanel, BorderLayout.NORTH);  // Positions the counter at top of frame
        addKeyListener(new KeyHandler());       // Add key listener
        pack();                                 // Size window
        setVisible(true);                       // Make visible
    }

    /**
     * Handles key events for the game.
     */
    private class KeyHandler extends KeyAdapter {
        /**
         *  Forwards key inputs on game frame onto the game
         * @param e The key event triggered, i.e. key pressed
         */
        @Override
        public void keyPressed (KeyEvent e) {
            game.keyPressed(e.getKeyCode());
            gamePanel.repaint();
        }
    }

    /**
     * Initializer of SGL2D
     * @param args
     */
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("choosertitle");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                new SGL2D(chooser.getSelectedFile().toString());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);
                System.out.println("Error, could not create game, file not readable or does not exist!");
            }
        } else {
            System.out.println("No Selection ");
        }
    }
}


/*
* future changes:
* move events into more specific classes
* move static fields too
* add position class to handle positioning for the generic game
* */