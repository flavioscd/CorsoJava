package util;

public class Timer2 {

    private static Long startTime;
    private static Long endTime;

    public static Long getElapsedTime() {
        return (endTime - startTime);

    }

    public static void start() {

        startTime = System.currentTimeMillis();

    }

    public static void end() {

        endTime = System.currentTimeMillis();
    }



    public static void main(String[] args) {


        Timer2.start();





        Timer2.end();

        System.out.println("Tempo in ms ->" +Timer2.getElapsedTime());

    }
}
