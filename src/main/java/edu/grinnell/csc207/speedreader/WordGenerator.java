package edu.grinnell.csc207.speedreader;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;


/** 
 * This class reads a text file word by word and keeps track
 * of how many words and sentences it has seen.
*/
public class WordGenerator {
    private Scanner scanner;
    private int wordCount;
    private int sentenceCount;

    /** 
     * Opens the file and starts the word and sentence counters at zero.
     * @param filename
     */
    public WordGenerator(String filename) throws IOException {
        this.scanner = new Scanner (new File(filename));
        this.wordCount = 0;
        this.sentenceCount = 0;
    }

    /**
     * Checks if there is another word left in the file to read.
     * @return true if there is a word, false if the file is finished.
     */
    public boolean hasNext() {
        return this.scanner.hasNext(); 
        
    }

    /** 
     * Grabs the next word from the file and updates the counters.
     * Checks the if the picked word ends with a punctuation that would make it a sentence.
     * @return The next word as a String.
     */
    public String next() {
        String word = this.scanner.next();
        this.wordCount++;

        if (word.endsWith(".") || word.endsWith("?") || word.endsWith("!"))
            this.sentenceCount++;

        return word;
    }

    /** 
     * returns the number of words read so far.
    */
    public int getWordCount() {
        return this.wordCount;
    }

    /** 
     * Returns the number of sentences read so far.
    */
    public int getSentenceCount() {
        return this.sentenceCount;
    }
}
