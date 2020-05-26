package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Main extends Frame {

    Main(String s){
        super(s);
        setSize(400,150);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing (WindowEvent ev){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Main("My program");
    }
}
