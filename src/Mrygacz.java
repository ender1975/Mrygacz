import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Mrygacz {

	private static final int FRAME_SIZE = 800;

	private static final int RECT_SIZE = 100;
	private static final int OFFSET = 100;

	private static final int START_X = 50;
	private static final int START_Y = 50;

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(FRAME_SIZE, FRAME_SIZE);
		frame.setTitle("Mrygacz");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2, 2, 300, 300));

		frame.getContentPane().setBackground( Color.BLACK );
		
			
		frame.add(new RectanglePanel(Color.BLUE, START_X, START_Y, RECT_SIZE, RECT_SIZE, 50));
		frame.add(new RectanglePanel(Color.RED, START_X + OFFSET, START_Y, RECT_SIZE, RECT_SIZE, 100));
		frame.add(new RectanglePanel(Color.GREEN, START_X, START_Y + OFFSET, RECT_SIZE, RECT_SIZE, 200));
		frame.add(new RectanglePanel(Color.YELLOW, START_X + OFFSET, START_Y + OFFSET, RECT_SIZE, RECT_SIZE, 400));		
		
		
		
		frame.setVisible(true);

	}

}
