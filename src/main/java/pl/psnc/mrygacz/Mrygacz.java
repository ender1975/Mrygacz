package pl.psnc.mrygacz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Mrygacz {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(Config.FRAME_SIZE, Config.FRAME_SIZE);
		frame.setTitle("Mrygacz (c) PCSS, 2015");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2, 2, Config.PANEL_BORDER, Config.PANEL_BORDER));

		frame.getContentPane().setBackground(Color.BLACK);

		frame.add(new BlinkingSquarePanel(Color.BLUE, Config.SQUARE_SIZE, Config.SQUARE_1_FREQ));
		frame.add(new BlinkingSquarePanel(Color.RED, Config.SQUARE_SIZE, Config.SQUARE_2_FREQ));
		frame.add(new BlinkingSquarePanel(Color.GREEN, Config.SQUARE_SIZE, Config.SQUARE_3_FREQ));
		frame.add(new BlinkingSquarePanel(Color.YELLOW, Config.SQUARE_SIZE, Config.SQUARE_4_FREQ));

		frame.setVisible(true);

	}

}
