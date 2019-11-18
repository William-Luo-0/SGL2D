import javax.swing.*;
import java.awt.*;

public class GamePanel  extends JPanel {
    private static final int GAME_WIDTH = 600;
    private static final int GAME_HEIGHT = 600;
    private GenericGame game;

    public GamePanel(GenericGame game) {
        setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
        setBackground(Color.BLACK);
        this.game = game;
    }

    @Override
    protected  void paintComponent (Graphics g) {
        super.paintComponent(game);
        paintGenericGame(game);
        if (game.gameOver()) {
            gameOver(game);
        }
    }

    private void paintGenericGame (Graphics game) {
        game.paint(game);
    }

    private void gameOver (Graphics g) {

    }
}
