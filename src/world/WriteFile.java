package world;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class WriteFile {

	public void saveToFile(int[][] i) throws IOException {

		FileWriter fw = new FileWriter("src/maps/" + getName() + ".dmf");

		for (int x = 0; x < i.length; x++) {
			fw.write("\n");
			for (int y = 0; y < i[0].length; y++) {

				fw.write((i[x][y] + "|"));
			}

		}

		fw.close();
	}

	private String getName() {
		String name = JOptionPane.showInputDialog("");

		if (name.length() <= 0) {
			name = getName();
		}

		return name;

	}
}
