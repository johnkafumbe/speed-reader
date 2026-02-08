package edu.grinnell.csc207.speedreader;

import java.awt.*;
import java.io.IOException;

/** TODO: implement this class and add a doc comment! */

public class SpeedReader {

    /** TODO: implement me and add an appropriate doc comment! */

    public int sleepTime(int wpm){
        int time = 60000 / wpm;
        return time;
    } 

    public void

    public static void main(String[] args) {
        System.out.println("Hello world!");

        if (args.length < 5){
            System.out.println("Incorrect argurments. Please print filename, width, height, font size and words per minute");
            return;
        }
        String filename = args[0];
        int w = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);
        int fontSz = Integer.parseInt(args[3]);
        int wpm = Integer.parseInt(args[4]);

        WordGenerator excerpt = new WordGenerator(filename);
        DrawingPanel panel = new DrawingPanel(w, h);
        Font f = new Font("Courier", Font.BOLD, fontSz);

        


    }  
}
