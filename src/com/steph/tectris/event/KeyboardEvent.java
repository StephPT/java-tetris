package com.steph.tectris.event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardEvent extends KeyAdapter {

    private GameState gameState;

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_DOWN) {
            gameState = GameState.DOWN;
        }
        if(key == KeyEvent.VK_LEFT) {
            gameState = GameState.LEFT;
        }
        if(key == KeyEvent.VK_RIGHT) {
            gameState = GameState.RIGHT;
        }
        if(key == KeyEvent.VK_UP) {
            gameState = GameState.ROTATE;
        }
        if(key == KeyEvent.VK_SPACE) {
            gameState = GameState.END;
        }
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
