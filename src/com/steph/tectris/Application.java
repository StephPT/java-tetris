package com.steph.tectris;

import com.steph.tectris.core.AbstractPiece;
import com.steph.tectris.core.Grid;
import com.steph.tectris.pieces.*;
import com.steph.tectris.window.GameWindow;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Application {

    private static final Point startLocation = new Point(5, 20);

    public static void main(String[] args) throws InterruptedException {
        Grid grid = Grid.getInstance().generate();
        GameWindow.getInstance().create("Tectris \uD83D\uDD79️");
        GameWindow.getInstance().getFrame().add(grid);
        GameWindow.getInstance().getFrame().setVisible(true);

        AtomicBoolean run = new AtomicBoolean(true);
        AbstractPiece currentPiece = randomPiece();
        while(run.get()) {
            if(!currentPiece.isFinished()) {
                try {
                    if(GameWindow.getInstance().getKeys().getGameState() != null) {
                        switch (GameWindow.getInstance().getKeys().getGameState()) {
                            case LEFT:
                                currentPiece.left();
                                break;
                            case RIGHT:
                                currentPiece.right();
                            case DOWN:
                                currentPiece.down();
                                break;
                            case END:
                                run.set(false);
                                break;
                        }
                        GameWindow.getInstance().getKeys().setGameState(null);
                    }
                    currentPiece.down();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
              currentPiece = randomPiece();
            }
            Thread.sleep(150);
        }

    }

    private static AbstractPiece randomPiece() {
        AbstractPiece result = null;
        Random ran = new Random();
        int nextPiece = ran.nextInt(7);
        switch (nextPiece) {
            case 0:
                result = new I().create();
                break;
            case 1:
                result = new Z().create();
                break;
            case 2:
                result = new T().create();
                break;
            case 3:
                result = new J().create();
                break;
            case 4:
                result = new L().create();
                break;
            case 5:
                result = new S().create();
                break;
            case 6:
                result = new O().create();
                break;
        }
        return result;
    }

}
