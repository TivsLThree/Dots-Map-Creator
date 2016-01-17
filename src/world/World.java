package world;

import static game.Settings.scaleFactor;
import static game.Settings.worldSize;

import java.awt.Color;
import java.awt.Graphics2D;

public class World {
	public World() {
		genBorders();

	}

	public static int[][] worldMap = new int[worldSize[0]][worldSize[1]];

	public static void genBorders() {
		for (int x = 0; x < worldMap.length; x++) {
			for (int y = 0; y < worldMap[0].length; y++) {
				if (x == 0 || y == 0 || x == worldMap.length - 1 || y == worldMap[0].length - 1) {
					worldMap[x][y] = -1;
				} else {
					worldMap[x][y] = 0;
				}
			}
		}
	}
	public void draw(Graphics2D g){
		for (int i = 0; i < worldMap.length; i++) {
			for (int k = 0; k < worldMap[0].length; k++) {

				if (worldMap[i][k] == 1) {
					g.setColor(new Color(30, 30, 30));

				} else if (worldMap[i][k] == -1) {
					g.setColor(new Color(100 + (int) (Math.random() * 100), 50 + (int) (Math.random() * 10),
							50 + (int) (Math.random() * 10)));
				} else {
					g.setColor(new Color(32,57,39));
				}
				g.fillRect(i * scaleFactor[0], k * scaleFactor[1], scaleFactor[0] - 1, scaleFactor[1] - 1);

			}
		}
	}

}
