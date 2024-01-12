/*
 * Iurii Golubnichenko and SienDev
 * Copyright (c) 2024.
 */
package corp.siendev.com.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {
    protected OrthographicCamera camera;
    protected Vector3 mouse;
    protected GameStateManager gameStateManager;

    protected State(GameStateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
        this.camera = new OrthographicCamera();
        this.mouse = new Vector3();
    }

    protected abstract void inputHandler();
    public abstract void update(float deltaTime);
    public abstract void render(SpriteBatch spriteBatch);
    public abstract void dispose();
}
