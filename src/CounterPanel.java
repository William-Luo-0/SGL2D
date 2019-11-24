import model.GenericGame;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 *  Creates CounterPanel for use by SGL2D
 */
public class CounterPanel extends JPanel implements Observer {
    private static final String COUNTER_ONE_TEXT = "Counter 1: ";
    private static final String COUNTER_TWO_TEXT = "Counter 2: ";
    private static final String COUNTER_THREE_TEXT = "Counter 3: ";
    private static final int COUNTER_WIDTH = 150;
    private static final int COUNTER_HEIGHT = 50;
    private GenericGame game;
    private JLabel counter1;
    private JLabel counter2;
    private JLabel counter3;

    /**
     * Initializes the CounterPanel
     * @param game  The game to be bound
     * @param c1Enable  Determines if counter 1 is enabled
     * @param c2Enable  Determines if counter 2 is enabled
     * @param c3Enable  Determines if counter 3 is enabled
     */
    public CounterPanel(GenericGame game, Boolean c1Enable, Boolean c2Enable, Boolean c3Enable) {
        this.game = game;                               // Sets field
        setBackground(new Color(20, 60, 90)); // Sets background of JPanel
        counter1 = new JLabel(COUNTER_ONE_TEXT + game.getStringCounter1(), SwingConstants.CENTER);        // Sets up Counter 1
        counter2 = new JLabel(COUNTER_TWO_TEXT + game.getStringCounter2(), SwingConstants.CENTER);        // Sets up Counter 2
        counter3 = new JLabel(COUNTER_THREE_TEXT + game.getStringCounter3(), SwingConstants.CENTER);      // Sets up Counter 3
        counter1.setPreferredSize(new Dimension(COUNTER_WIDTH, COUNTER_HEIGHT));    // Sets up Counter 1 dimensions
        counter2.setPreferredSize(new Dimension(COUNTER_WIDTH, COUNTER_HEIGHT));    // Sets up Counter 2 dimensions
        counter3.setPreferredSize(new Dimension(COUNTER_WIDTH, COUNTER_HEIGHT));    // Sets up Counter 3 dimensions
        counter1.setForeground(Color.WHITE);    // Sets text color
        counter2.setForeground(Color.WHITE);    // Sets text color
        counter3.setForeground(Color.WHITE);    // Sets text color
        add(counter1);                                  // Add counter 1 to panel
        add(Box.createHorizontalStrut(10));      // Add spacer
        add(counter2);                                  // Add counter 2 to panel
        add(Box.createHorizontalStrut(10));      // Add spacer
        add(counter3);                                  // Add counter 3 to panel
        counter1.setVisible(c1Enable);                  // Sets visibility of counter 1
        counter2.setVisible(c2Enable);                  // Sets visibility of counter 2
        counter3.setVisible(c3Enable);                  // Sets visibility of counter 3
    }

    /**
     * Sets the visibility of counter 1 on the CounterPanel
     * @param isVisible Determines if counter 1 is enabled
     */
    public void setCounter1Visibility (Boolean isVisible) {
        counter1.setVisible(isVisible);
    }

    /**
     * Sets the visibility of counter 2 on the CounterPanel
     * @param isVisible Determines if counter 2 is enabled
     */
    public void setCounter2Visibility (Boolean isVisible) {
        counter2.setVisible(isVisible);
    }

    /**
     * Sets the visibility of counter 3 on the CounterPanel
     * @param isVisible Determines if counter 3 is enabled
     */
    public void setCounter3Visibility (Boolean isVisible) {
        counter3.setVisible(isVisible);
    }

    /**
     * Update method for CounterPanel observing bound game
     * @param o Game bound
     * @param arg   X
     */
    @Override
    public void update (Observable o, Object arg) {
        counter1.setText(COUNTER_ONE_TEXT + game.getStringCounter1());         // Updates Counter 1 on change
        counter2.setText(COUNTER_TWO_TEXT + game.getStringCounter2());         // Updates Counter 2 on change
        counter3.setText(COUNTER_THREE_TEXT + game.getStringCounter3());       // Updates Counter 3 on change
        repaint();      // Updates panel
    }
}
