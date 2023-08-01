package util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Timer {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }


    public static void main(String[] args) {
        Timer t = new Timer();


        t.start();



        t.end();

        System.out.println("Tempo trascorso: " + t.getElapsedTime() + " ms.");
    }

}

