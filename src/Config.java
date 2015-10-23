
public class Config {

	//Initial window size (square)
	public static final int FRAME_SIZE = 800;

	//Blinking square size
	public static final int SQUARE_SIZE = 200;
	
	//Square panel border
	public static final int PANEL_BORDER = 200;
	
	//Square 1 frequency (Hz)
	public static final int SQUARE_1_FREQ = 1;
	
	//Square 2 frequency (Hz)
	public static final int SQUARE_2_FREQ = 2;

	//Square 3 frequency (Hz)
	public static final int SQUARE_3_FREQ = 4;

	//Square 4 frequency (Hz)
	public static final int SQUARE_4_FREQ = 8;
	
	
	
	public static long getBlinkInterval(int frequency) {
		return (long) 1000/frequency;
	}

	
}
