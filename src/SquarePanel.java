import java.awt.Color;


public class SquarePanel extends RectanglePanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SquarePanel(Color color, int size, long blinkInterval) {
		this(color, size, size, blinkInterval);
	
	}
	private SquarePanel(Color color, int width, int height, long blinkInterval) {
		super(color, width, height, blinkInterval);
	}

}
