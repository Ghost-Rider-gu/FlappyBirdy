/*
 * Iurii Golubnichenko and SienDev
 * Copyright (c) 2024.
 */
package corp.siendev.com.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import corp.siendev.com.GameConstants;

public class MenuState extends State {
    private final Texture menuBackground;
    private final Texture playButton;

    public MenuState(GameStateManager gameStateManager) {
        super(gameStateManager);
        this.menuBackground = new Texture("menuBackground.png");
        this.playButton = new Texture("playButton.png");
    }

    @Override
    public void inputHandler() {

    }

    @Override
    public void update(float deltaTime) {

    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.begin();
        spriteBatch.draw(this.menuBackground, 0, 0, GameConstants.WIDTH, GameConstants.HEIGHT);
        spriteBatch.draw(this.playButton, (GameConstants.WIDTH / 2 - 50), GameConstants.HEIGHT / 2, 100, 80);
        spriteBatch.end();
    }

    @Override
    public void dispose() {
        this.menuBackground.dispose();
        this.playButton.dispose();
    }
}
