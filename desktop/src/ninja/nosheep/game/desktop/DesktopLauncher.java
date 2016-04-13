package ninja.nosheep.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ninja.nosheep.client.Patcher;
import ninja.nosheep.game.MainController;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "Tenta";
		config.width = 1280;
		config.height = config.width / 16 * 9;

		// TODO: Run patcher before launching the MainController
			//Patcher patcher = new Patcher();
			// while(!patcher.isFinished())

		new LwjglApplication(new MainController(), config);
	}
}
