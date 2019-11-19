import model.GenericGame;

import javax.swing.*;
import java.awt.*;

/**
 *  Creates GamePanel for use by SGL2D
 */
public class GamePanel  extends JPanel {
    private static final int GAME_WIDTH = 600;
    private static final int GAME_HEIGHT = 600;
    private GenericGame game;

    /**
     * Initializes the GamePanel
     * @param game The game to be bound
     */
    public GamePanel(GenericGame game) {
        setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
        setBackground(Color.BLACK);
        this.game = game;
    }

    /**
     * Paints the GamePanel
     * @param g the panel to paint game over
     */
    @Override
    protected  void paintComponent (Graphics g) {
        super.paintComponent(g);
        paintGenericGame(g);
        if (this.game.isGameOver()) {
            gameOver(g);
        }
    }

    /**
     * Paints the game onto the GamePanel
     * @param g the panel to paint game over
     */
    private void paintGenericGame (Graphics g) {
        this.game.paint(g);
    }

    /**
     * Paints game over onto GamePanel
     * @param g the panel to paint game over
     */
    private void gameOver (Graphics g) {
        Color saved = g.getColor();
        g.setColor(new Color( 0, 0, 0));
        g.setFont(new Font("Arial", 20, 20));
        FontMetrics fm = g.getFontMetrics();
        centreString("GamePanel Over!", g, fm, GAME_HEIGHT / 2);
        g.setColor(saved);
    }

    /**
     * Locates the center of the GamePanel and prints the given string.
     * @param str the string to print
     * @param g the panel to paint over
     * @param fm the font
     * @param yPos the y-position in GamePanel
     */
    private void centreString(String str, Graphics g, FontMetrics fm, int yPos) {
        int width = fm.stringWidth(str);
        g.drawString(str, (GAME_WIDTH - width) / 2, yPos);
    }
}
