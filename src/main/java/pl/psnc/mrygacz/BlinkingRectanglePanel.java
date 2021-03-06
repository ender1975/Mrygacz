package pl.psnc.mrygacz;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;


/**
 * Blinking rectangle panel showing a blinking rectangle in the middle of it.
 * You can set the color, size and blinking frequency of the rectangle within the panel.
 */
public class BlinkingRectanglePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean isVisible = false;
	
	private static final long ANIMATION_DELAY = 0;

	// For telling the panel to be repainted at regular intervals
	private ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

	private Color color;
	private int width, height;
	private long blinkInterval;

	public BlinkingRectanglePanel(Color color, int width, int height, int blinkFrequency) {
		super();
		this.color = color;

		this.width = width;
		this.height = height;
		this.blinkInterval = getBlinkInterval(blinkFrequency);
		setBackground(Color.BLACK);

		startBlinking();
	}

	
	
	private void startBlinking() {				
		executor.scheduleAtFixedRate(this::repaint, ANIMATION_DELAY, blinkInterval, TimeUnit.MILLISECONDS);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);

		if (isVisible) {
			drawCenteredRectangle(Color.BLACK, g);
			isVisible = false;
		} else {
			drawCenteredRectangle(color, g);
			isVisible = true;
		}

	}

	private void drawCenteredRectangle(Color color, Graphics g) {

		int panelWidth = getWidth();
		int panelHeight = getHeight();

		int x = (int) (panelWidth / 2 - 0.5 * width);
		int y = (int) (panelHeight / 2 - 0.5 * height);
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}

	/**
	 * Get blink interval in milliseconds
	 * @param frequency Frequency of blinking in Hz
	 * @return interval in milliseconds
	 */
	private static long getBlinkInterval(int frequency) {
		return (long) 1000/frequency;
	}
}
