package com.steph.tectris.pieces;

import com.steph.tectris.core.AbstractPiece;
import com.steph.tectris.core.Grid;

import java.awt.*;

public class T extends AbstractPiece {

    public T() {
        super();
        setCurrentColour(T);
        pieces = new byte[][]{
                {0, 1, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
    }

    @Override
    public void rotate() {

    }
}
