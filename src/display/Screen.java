package display;

import java.awt.Color;

import javax.swing.JFrame;

import game.Main;

public class Screen extends JFrame{
	public Screen(String title, int width, int height) {
		this.setTitle(title);
		this.setSize(width, height);
	}

	public void wakeUp() {
		this.setBackground(Color.cyan);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.add(Main.sc);
		this.addKeyListener(Main.keys);
		this.addMouseListener(Main.mouse);
	}
}