package pl.psnc.mrygacz;

import java.awt.Color;

/**
 * Blinking square panel.
 *
 * You can set the color, size and blinking frequency of the square in the middle of the panel.
 */
public class BlinkingSquarePanel extends BlinkingRectanglePanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public BlinkingSquarePanel(Color color, int size, int blinkFrequency) {
		this(color, size, size, blinkFrequency);
	
	}
	private BlinkingSquarePanel(Color color, int width, int height, int blinkFrequency) {
		super(color, width, height, blinkFrequency);
	}

}
