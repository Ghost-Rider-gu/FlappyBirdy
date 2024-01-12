/*
 * Iurii Golubnichenko and SienDev
 * Copyright (c) 2024.
 */
package corp.siendev.com.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class GameStateManager {
    private final Stack<State> states;

    public GameStateManager() {
        this.states = new Stack<>();
    }

    public GameStateManager(Stack<State> states) {
        this.states = states;
    }

    public void push(State newState) {
        states.push(newState);
    }

    public void pop() {
        states.pop();
    }

    public void set(State state) {
        states.pop();
        states.push(state);
    }

    public void update(float deltaTime) {
        states.peek().update(deltaTime);
    }

    public void render(SpriteBatch spriteBatch) {
        states.peek().render(spriteBatch);
    }
}
