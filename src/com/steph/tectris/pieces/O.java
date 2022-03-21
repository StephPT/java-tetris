package com.steph.tectris.pieces;

import com.steph.tectris.core.AbstractPiece;

public class O extends AbstractPiece {

    public O() {
        super();
        setCurrentColour(SQUARE);
        pieces = new byte[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
    }

    @Override
    public void rotate() {
        //doesn't need to rotate
    }
}
