package edu.grinnell.csc207.speedreader;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;


/** TODO: implement this class and add a doc comment! */
public class WordGenerator {
    private Scanner scanner;
    private int wordCount;
    private int sentenceCount;

    /** TODO: implement me and add an appropriate doc comment! */
    public WordGenerator(String filename) throws IOException {
        this.scanner = new Scanner (new File(filename));
        this.wordCount = 0;
        this.sentenceCount = 0;
    }

    /** TODO: implement me and add an appropriate doc comment! */
    public boolean hasNext() {
        return this.scanner.hasNext(); 
        
    }

    /** TODO: implement me and add an appropriate doc comment! */
    public String next() {
        String word = this.scanner.next();
        this.wordCount++;

        if (word.endsWith(".") || word.endsWith("?") || word.endsWith("!"))
            this.sentenceCount++;

        return word;
    }

    /** TODO: implement me and add an appropriate doc comment! */
    public int getWordCount() {
        return this.wordCount;
    }

    /** TODO: implement me and add an appropriate doc comment! */
    public int getSentenceCount() {
        return this.sentenceCount;
    }
}
