package com.steph.tectris.core;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    protected Piece() {
        grid = Grid.getInstance();
    }

    public byte[][] pieces;

    protected List<Grid> locations = new ArrayList<>();

    private boolean finished = false;

    protected Grid grid;

    private Color currentColour;

    public static final Color T = new Color(96, 26, 175);

    public static final Color SQUARE = Color.YELLOW;

    public static final Color I = Color.CYAN;

    public static final Color S = new Color(52, 138, 26);

    public static final Color J = Color.BLUE;

    public static final Color L = new Color(196, 96, 24);

    public static final Color Z = Color.red;

    public void down() {
        for (int i = locations.size(); i > 0; i--) {
            Grid grid = locations.get(i - 1);
            Point point = new Point(grid.getLocation());
            grid.setPiece(false);
            grid.setBackground(Grid.BACKGROUND);
            locations.remove(i - 1);
            point.x++;
            grid = Grid.getInstance().getPosition(point);
            grid.setBackground(getCurrentColour());
            grid.setPiece(true);
            locations.add(i - 1, grid);
        }
        hasFinished();

        for (Grid location : locations) {
            log(location.getLocation());
        }
        System.out.println("\r\n------------------------------------");
    }

    public abstract void rotate();

    public Piece create() {
        for(int i = 0; i < pieces.length; i++) {
            for(int l = 0; l < pieces[i].length; l++) {
                int x = 5;
                int y = 20;
                if (pieces[i][l] == 1) {
                    x += i;
                    y += l;
                    Grid temp = grid.getPosition(x, y);
                    temp.setBackground(getCurrentColour());
                    temp.setPiece(true);
                    add(temp);
                }
            }
        }
        return this;
    }

    public void add(Grid grid) {
        this.locations.add(grid);
    }

    private boolean hasFinished() {
        for(int i = locations.size(); i > 0; i--) {
            Grid current = locations.get(i - 1);
            Grid toCheck = Grid.getInstance().getPosition(current.getLocation().x + 1, current.getLocation().y);
            if(toCheck.isPiece()) {
                if(!locations.contains(toCheck)) {
                    setFinished();
                }
            }
        }
        return isFinished();
    }

    public void left() {
        for(Grid grid : locations) {
            if(grid.getLocation().y <= 1) {
                return;
            }
        }
        for(int i = 0; i < locations.size(); i++) {
            Grid grid = locations.get(i);
            Point current = grid.getLocation();
            grid.setPiece(false);
            grid.setBackground(Grid.BACKGROUND);
            locations.remove(i);
            Grid updated = Grid.getInstance().getPosition(current.x, current.y - 1);
            updated.setBackground(getCurrentColour());
            locations.add(i, updated);
        }
    }

    public void right() {
        for(Grid grid : locations) {
            if(grid.getLocation().y >= 39) {
                return;
            }
        }
        for(int i = locations.size(); i > 0; i--) {
            Grid grid = locations.get(i - 1);
            Point current = grid.getLocation();
            grid.setPiece(false);
            grid.setBackground(Grid.BACKGROUND);
            locations.remove(i - 1);
            Grid updated = Grid.getInstance().getPosition(current.x, current.y + 1);
            updated.setBackground(getCurrentColour());
            locations.add(i - 1, updated);
        }
    }

    private void log(Point point) {
        System.out.println(String.format("Piece %s - x: %s y: %s", this, point.x, point.y));
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished() {
        this.finished = true;
    }

    protected void setCurrentColour(Color currentColour) {
        this.currentColour = currentColour;
    }

    protected Color getCurrentColour() {
        return currentColour;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
