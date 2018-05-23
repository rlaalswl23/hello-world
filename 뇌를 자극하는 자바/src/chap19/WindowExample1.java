package chap19;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowExample1 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Hello Java Program");

		//frame.setLocation(500,400);
		
		frame.setPreferredSize(new Dimension(300, 200));
		Container contentPane = frame.getContentPane();
		
		JLabel label = new JLabel("Hello, Java", SwingConstants.CENTER);
		contentPane.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); // 화면 정중앙 배치

	}

}
