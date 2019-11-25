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
    private static final String COUNTER_TWO_TEXT = "Counter 1: ";
    private static final String COUNTER_THREE_TEXT = "Counter 1: ";
    private static final int COUNTER_WIDTH = 200;
    private static final int COUNTER_HEIGHT = 40;
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
        counter1 = new JLabel(COUNTER_ONE_TEXT);        // Sets up Counter 1
        counter2 = new JLabel(COUNTER_TWO_TEXT);        // Sets up Counter 2
        counter3 = new JLabel(COUNTER_THREE_TEXT);      // Sets up Counter 3
        counter1.setPreferredSize(new Dimension(COUNTER_WIDTH, COUNTER_HEIGHT));    // Sets up Counter 1 dimensions
        counter2.setPreferredSize(new Dimension(COUNTER_WIDTH, COUNTER_HEIGHT));    // Sets up Counter 2 dimensions
        counter3.setPreferredSize(new Dimension(COUNTER_WIDTH, COUNTER_HEIGHT));    // Sets up Counter 3 dimensions
        add(counter1);                                  // Add counter 1 to panel
        add(Box.createHorizontalStrut(10));      // Add spacer
        add(counter2);                                  // Add counter 2 to panel
        add(Box.createHorizontalStrut(10));      // Add spacer
        add(counter3);                                  // Add counter 3 to panel
        counter1.setVisible(c1Enable);                  // Sets visibility of counter 1
        counter2.setVisible(c1Enable);                  // Sets visibility of counter 2
        counter3.setVisible(c1Enable);                  // Sets visibility of counter 3
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
        if(arg == "endGame"){
            setCounter1Visibility(false);
            setCounter2Visibility(false);
            setCounter3Visibility(false);
        }
        counter1.setText(COUNTER_ONE_TEXT + game.getValueCounter1());         // Updates Counter 1 on change
        counter2.setText(COUNTER_ONE_TEXT + game.getValueCounter2());         // Updates Counter 2 on change
        counter3.setText(COUNTER_ONE_TEXT + game.getValueCounter3());       // Updates Counter 3 on change
        repaint();      // Updates panel
    }
}
