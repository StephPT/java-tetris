package com.steph.tectris.pieces;

import com.steph.tectris.core.Piece;

public class L extends Piece {

    public L() {
        super();
        setCurrentColour(L);
        pieces = new byte[][]{
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
    }

    @Override
    public void rotate() {

    }
}
