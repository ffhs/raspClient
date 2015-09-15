package net.p45q.raspberrycontroller;

import android.content.Context;

/**
 * Created by pascal on 8/24/15.
 */
public class KeepAlive implements Runnable {
    Context context;
    public KeepAlive(Context context)
    {
        this.context = context;
    }
    @Override
    public void run() {
        Integer increment = 0;
        while (true)
        {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            new SendPing(increment, context).execute();
            increment++;
        }
    }
}
