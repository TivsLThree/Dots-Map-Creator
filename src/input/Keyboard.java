package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import game.Main;
import javafx.scene.input.KeyCode;

public class Keyboard implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e);
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			Main.mapEditor.chosenBlock = Main.mapEditor.chosenBlock.next();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
