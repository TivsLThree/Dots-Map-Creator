package update;

import game.Main;
import game.Settings;
import world.Block;

public class EditMap {
	public Block chosenBlock = Block.STONE;

	private static boolean shouldDraw() {
		return Main.mouse.isPressed && !isEdge(Main.mouse.pos);
	}

	private static boolean isEdge(int[] i) {
		i = convertToMapSize(i);
		return (i[0] == 0 || i[1] == 0 || i[0] == Main.world.worldMap.length - 1
				|| i[1] == Main.world.worldMap[0].length - 1);
	}

	private static int[] convertToMapSize(int[] i) {
		int[] cPos = Main.mouse.pos.clone();
		cPos[0] -= Settings.scaleFactor[0];
		cPos[1] -= Settings.scaleFactor[1];
		cPos[0] = i[0] / Settings.scaleFactor[0];
		cPos[1] = i[1] / Settings.scaleFactor[1];
		return cPos;
	}

	private static boolean isOutOfThisWorld(int[] i) {
		return i[0] > Settings.width || i[1] > Settings.height;
	}

	public void tick() {
	
		if (isOutOfThisWorld(Main.mouse.pos)) {
			return;
		}
		if (Main.mouse.isClear && shouldDraw()) {
			int[] cPos = convertToMapSize(Main.mouse.pos);

			try {
				Main.world.worldMap[cPos[0]][cPos[1]] = 0;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println(e.getMessage());
			}
		}
		else if (shouldDraw()) {

			int[] cPos = convertToMapSize(Main.mouse.pos);

			try {
				Main.world.worldMap[cPos[0]][cPos[1]] = chosenBlock.getBlockID();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println(e.getMessage());
			}
		}
		;
	}
}
