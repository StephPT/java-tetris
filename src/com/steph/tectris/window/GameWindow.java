package com.steph.tectris.window;

import com.steph.tectris.event.KeyboardEvent;

import javax.swing.*;
import java.awt.event.KeyAdapter;

public class GameWindow {

    private static GameWindow window = null;

    private JFrame frame = null;

    private KeyboardEvent keys = null;

    public static GameWindow getInstance() {
        if(window == null) {
            window = new GameWindow();
        }
        return window;
    }

    public void create(String name) {
        frame = new JFrame(name);
        keys = new KeyboardEvent();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(keys);
        frame.setResizable(false);
        frame.setSize(1000, 1000);
    }

    public JFrame getFrame() {
        return frame;
    }

    public KeyboardEvent getKeys() {
        return keys;
    }
}
