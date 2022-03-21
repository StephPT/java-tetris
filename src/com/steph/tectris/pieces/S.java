package com.steph.tectris.pieces;

import com.steph.tectris.core.AbstractPiece;

public class S extends AbstractPiece {

    public S() {
        super();
        setCurrentColour(S);
        pieces = new byte[][]{
                {0, 1, 1, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
    }

    @Override
    public void rotate() {

    }
}
