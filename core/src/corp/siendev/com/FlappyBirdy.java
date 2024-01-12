/*
 * Iurii Golubnichenko and SienDev
 * Copyright (c) 2024.
 */
package corp.siendev.com;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import corp.siendev.com.states.GameStateManager;
import corp.siendev.com.states.MenuState;

public class FlappyBirdy extends ApplicationAdapter {
	private GameStateManager gameStateManager;
	private SpriteBatch spriteBatch;
	
	@Override
	public void create () {
		gameStateManager = new GameStateManager();
		spriteBatch = new SpriteBatch();
		ScreenUtils.clear(1, 0, 0, 1);
		gameStateManager.push(new MenuState(gameStateManager));
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gameStateManager.update(Gdx.graphics.getDeltaTime());
		gameStateManager.render(spriteBatch);
	}
	
	@Override
	public void dispose () {
		spriteBatch.dispose();
	}
}
