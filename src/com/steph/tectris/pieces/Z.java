package com.steph.tectris.pieces;

import com.steph.tectris.core.AbstractPiece;

public class Z extends AbstractPiece {

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
