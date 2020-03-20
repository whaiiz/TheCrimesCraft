package pt.ganda.thecrimscraft.utils;

import java.util.Timer;
import java.util.TimerTask;

public class TheftTimer {

    static int interval = 31;
    static Timer timer = new Timer();

    public static void main(String[] args) {

        int delay = 1000;
        int period = 1000;

        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {

                setInterval();

                if(interval % 5 == 0){
                    System.out.println(interval);
                }

            }
        }, delay, period);
    }

    private static final int setInterval() {

        if (interval == 1)
            timer.cancel();
        return --interval;
    }
}
