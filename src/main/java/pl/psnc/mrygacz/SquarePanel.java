package pl.psnc.mrygacz;

import java.awt.Color;


public class SquarePanel extends RectanglePanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SquarePanel(Color color, int size, int blinkFrequency) {
		this(color, size, size, blinkFrequency);
	
	}
	private SquarePanel(Color color, int width, int height, int blinkFrequency) {
		super(color, width, height, blinkFrequency);
	}

}
