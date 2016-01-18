package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import game.Main;

public class Keyboard implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e);
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			Main.mapEditor.chosenBlock = Main.mapEditor.chosenBlock.next();
		}else if(e.getKeyCode() == KeyEvent.VK_ENTER){
			try {
				Main.wf.saveToFile(Main.world.worldMap);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
