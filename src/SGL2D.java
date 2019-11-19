import model.GenericGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SGL2D extends JFrame {

    private GenericGame game;
    private GamePanel gamePanel;
    private CounterPanel counterPanel;

    // Future Implementations:
    // Use timer from Javax.Swing.Timer to create tick based games, initialize timer to set default update cycle

    /**
     * SGL2D Game Frame Initializer
     */
    public SGL2D() {
        super("SGL2D Game");                       // JFrame frame = new JFrame("Frame Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(false);                  // Will display window bar
        game = new GenericGame();               // Create new game, may change for interpreter!
        gamePanel = new GamePanel(game);        // Create game JPanel
        counterPanel = new CounterPanel(game, false, false, false);  // Create counter JPanel
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

    // TODO: CHANGE THIS AS WELL AS SGL2D() to call GameFactory with given file input.
    /**
     * Initializer of SGL2D
     * @param args
     */
    public static void main(String[] args) {
        new SGL2D();
    }
}
