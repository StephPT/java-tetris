package com.steph.tectris.core;

import javax.swing.*;
import java.awt.*;

public class Grid extends JPanel {

    public static Grid grid;

    public static final Color BACKGROUND = Color.BLACK;

    private boolean piece;

    private Point location = new Point();

    private final Grid[][] board = new Grid[40][40];

    public void setPiece(boolean piece) {
        this.piece = piece;
    }

    public boolean isPiece() {
        return piece;
    }

    public Grid getPosition(int x, int y) {
        if(x >= 40 || y >= 40 || x <= 0 || y <= 0){
            System.out.println("Tried to access item outside of the array");
            Grid grid = new Grid();
            grid.setPiece(true);
            return grid;
        }
        return board[x][y];
    }

    public Grid getPosition(Point point) {
        return board[point.x][point.y];
    }

    public static Grid getInstance() {
        if(grid == null) {
            grid = new Grid();
        }
        return grid;
    }

    public Grid() {
    }

    public Grid(FlowLayout layout) {
        super(layout);
    }

    public Grid generate() {
        JPanel grid = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        grid.setPreferredSize(new Dimension(800, 800));
        grid.setBackground(Color.BLUE);
        //grid gen
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = cell(i, j);
                grid.add(board[i][j]);
            }
        }
        add(grid);
        return this;
    }

    public void tick() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(!board[i][j].piece) {
                    board[i][j].setBackground(BACKGROUND);
                }
            }
        }
    }

    public void setPoint(int x, int y) {
        this.location.x = x;
        this.location.y = y;
    }

    public Point getLocation() {
        return this.location;
    }

    private Grid cell(int x, int y) {
        Grid result = new Grid(new FlowLayout(FlowLayout.CENTER, 0, 0));
        result.setBackground(BACKGROUND);
        result.setPreferredSize(new Dimension(20, 20));
        result.setLocation(x * 40, y * 40);
        result.setPiece(false);
        result.setPoint(x, y);
        return result;
    }


}
