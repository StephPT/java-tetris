package com.steph.tectris.pieces;

import com.steph.tectris.core.AbstractPiece;

import java.awt.*;
import java.util.Random;

public class U extends AbstractPiece {

    public U() {
        super();
        Random random = new Random();
        setCurrentColour(Color.MAGENTA);
        pieces = new byte[][]{
                {1, 0, 1, 0, 0},
                {1, 0, 1, 0, 0},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
    }

    @Override
    public void rotate() {

    }
}
