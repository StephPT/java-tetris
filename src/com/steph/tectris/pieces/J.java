package com.steph.tectris.pieces;

import com.steph.tectris.core.AbstractPiece;

public class J extends AbstractPiece {

    public J() {
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
