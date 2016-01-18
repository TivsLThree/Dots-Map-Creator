package input;

import java.awt.event.MouseEvent;

import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

import game.Main;

public class Mouse extends MouseInputAdapter {
	public boolean isClear = false;
	public boolean isPressed = false;
	public int[] pos = { 0, 0 };

	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getButton() == 3){
			isClear = true;
		}
		isPressed = true;
		e = SwingUtilities.convertMouseEvent(Main.screen, e, Main.sc);
		pos[0] = e.getX();
		pos[1] = e.getY();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 3){
			isClear = true;
		}
		isPressed = true;
		e = SwingUtilities.convertMouseEvent(Main.screen, e, Main.sc);
		pos[0] = e.getX();
		pos[1] = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		isClear = false;
		isPressed = false;

	}

}
