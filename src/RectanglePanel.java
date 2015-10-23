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
	private int x, y, width, height;
	private int blinkInterval;



	public RectanglePanel(Color color, int x, int y, int width, int height, int blinkInterval) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.blinkInterval = blinkInterval;
		setBackground(Color.BLACK );
		
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
		
		
		int panelWidth = getWidth();
		int panelHeight = getHeight();
		
		
		
		if (isVisible) {
			g.setColor(Color.BLACK );
			g.fillRect(x, y, width, height);			
			isVisible = false;
		} else {
			g.setColor(color);
			g.fillRect(x, y, width, height);
			isVisible = true;
		}
		

	}
	
	
	
	private void drawCenteredRectangle(Color color) {
		
	}

}
