package com.steph.tectris.pieces;

import com.steph.tectris.core.Piece;

public class I extends Piece {

    public I() {
        super();
        setCurrentColour(I);
        pieces = new byte[][]{
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
    }

    @Override
    public void rotate() {

    }
}
