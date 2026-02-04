package edu.grinnell.csc207.mysteries;

class StaticCounterExample {
    public static int value;
    public StaticCounterExample() {
        value = 0;
    }
    public void increment(int value) {
        StaticCounterExample.value += value;
    }
}

public class StaticExample {
    public static void printGreeting() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        // Uncomment this line and find out if it works!
        printGreeting();
        StaticCounterExample ex1 = new StaticCounterExample();
        StaticCounterExample ex2 = new StaticCounterExample();
        ex1.increment(3);
        System.out.println("ex1=" + ex1.value + " ex2 = " + ex2.value); 
    }
}
