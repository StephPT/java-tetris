package com.steph.tectris.pieces;

import com.steph.tectris.core.Piece;

public class Z extends Piece {

    public Z() {
        super();
        setCurrentColour(Z);
        pieces = new byte[][]{
                {1, 1, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
    }

    @Override
    public void rotate() {

    }
}
