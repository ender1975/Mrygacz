import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;

public class RectanglePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean isVisible = false;

	// For telling the panel to be repainted at regular intervals
	ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

	private Color color;
	private int width, height;
	private long blinkInterval;

	public RectanglePanel(Color color, int width, int height, long blinkInterval) {
		super();
		this.color = color;

		this.width = width;
		this.height = height;
		this.blinkInterval = blinkInterval;
		setBackground(Color.BLACK);

		startBlinking();
	}

	public void startBlinking() {
		service.scheduleAtFixedRate(new Runnable() {
			public void run() {
				repaint();
			}
		}, 0, blinkInterval, TimeUnit.MILLISECONDS);
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

}
