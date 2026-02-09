package edu.grinnell.csc207.speedreader;

import java.awt.*;
import java.io.IOException;

/** 
 * This is the main program that runs the speed reader. 
 * It takes a file and flashes the words one by one on a screen.
*/

public class SpeedReader{

    /** 
     * The main method that starts the program.
     * @param args are filename, width, height, font size, and WPM.
    */
   
    public static void main(String[] args) throws Exception {

        if (args.length != 5){
            System.out.println("Incorrect argurments. Please print filename, width, height, font size and words per minute");
            return;
        }
        
        //Define Arguments
        String filename = args[0];
        int w = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);
        int fontSz = Integer.parseInt(args[3]);
        int wpm = Integer.parseInt(args[4]);

        int sleepTime = 60000 / wpm;

        // Using word generator,drawing panel and graphics tools.
        WordGenerator excerpt = new WordGenerator(filename);
        DrawingPanel panel = new DrawingPanel(w, h);
        Graphics g = panel.getGraphics();
        Font f = new Font("Courier", Font.BOLD, fontSz);
        g.setFont(f);


        //loop for displaying words on the panel
        while (excerpt.hasNext()) {

            // Fill the rectangle with a white screen before the word is displayed
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, w, h);
            
            // Set the color of the word to black and pull the word from the word generator, then display
            // the word using drawstring to display on the panel.
            g.setColor(Color.BLACK);
            String word = excerpt.next();
            g.drawString(word, w / 4, h / 4);
            Thread.sleep(sleepTime);
        }

        // When the loop is done display the word and sentence count.
        System.out.println("Total words: " + excerpt.getWordCount());
        System.out.println("Total sentences: " + excerpt.getSentenceCount());
            
        }

    }  

