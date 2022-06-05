package com.steph.tectris.pieces;

import com.steph.tectris.core.Piece;

public class O extends Piece {

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
