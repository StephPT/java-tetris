package com.steph.tectris.pieces;

import com.steph.tectris.core.AbstractPiece;
import com.steph.tectris.core.Grid;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class I extends AbstractPiece {

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
