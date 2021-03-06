package com.exovum.ludumdare.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.exovum.ludumdare.LDGame;
import com.exovum.ludumdare.TiledTestSuperKoalio;

public class TestLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        // default width and height, but setting with config.width in case I want to change it later
        config.width = 640;
        config.height = 480;
		new LwjglApplication(new TiledTestSuperKoalio(), config);
	}
}
