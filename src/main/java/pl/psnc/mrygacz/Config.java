package pl.psnc.mrygacz;


public class Config {

	//Initial window size (square)
	public static final int FRAME_SIZE = 800;

	//Blinking square size
	public static final int SQUARE_SIZE = 150;
	
	//Square panel border
	public static final int PANEL_BORDER = 200;
	
	//Square 1 frequency (Hz)
	public static final int SQUARE_1_FREQ = 8;
	
	//Square 2 frequency (Hz)
	public static final int SQUARE_2_FREQ = 10;

	//Square 3 frequency (Hz)
	public static final int SQUARE_3_FREQ = 12;

	//Square 4 frequency (Hz)
	public static final int SQUARE_4_FREQ = 25;
	
	
	/**
	 * Get blink interval in milliseconds
	 * @param frequency Frequency of blinking in Hz
	 * @return interval in milliseconds
	 */
	public static long getBlinkInterval(int frequency) {
		return (long) 1000/frequency;
	}

	
}
