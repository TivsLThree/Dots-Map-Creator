package game;

import display.Screen;
import display.ScreenCanvas;
import input.Keyboard;
import input.Mouse;
import threads.ThreadManager;
import update.EditMap;
import update.GameUpdater;
import world.World;

public class Main {
	public static Screen screen;
	public static ScreenCanvas sc;
	public static ThreadManager threadOverseer;
	public static GameUpdater updater;
	public static Keyboard keys;
	public static Mouse mouse;
	public static World world;
	public static EditMap mapEditor;
	public static void main(String[] args) {
		initAll();
		wakeUp();

	}

	private static void initAll() {
		// Uses default screen size.
		mapEditor = new EditMap();
		world = new World();
		keys = new Keyboard();
		mouse = new Mouse();
		updater = new GameUpdater();
		sc = new ScreenCanvas();
		screen = new Screen(Settings.name,Settings.width,Settings.height);
		threadOverseer = new ThreadManager();
		
		
		
		//
	}

	private static void wakeUp() {
		screen.wakeUp();
		threadOverseer.wakeUp();

	}
}
