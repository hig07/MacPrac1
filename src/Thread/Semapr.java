package Thread;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Semapr {
    public static void main(String[] args){
        Runnable limitedCall = new Runnable() {
            final Random rand = new Random();
            final Semaphore available = new Semaphore(3);
            int cnt = 0;

            @Override
            public void run(){
                int time = rand.nextInt(12);
                int num = cnt++;

                try{
                    available.acquire();
                    System.out.println("Executing long-running action for " + time + " second : " + num);
                    Thread.sleep(time * 1000);
                    System.out.println(num + " Thread end.");
                    available.release();
                }catch(InterruptedException intEx){
                    intEx.printStackTrace();
                }
            }
        };
        for(int i = 0; i < 10; i++){
            new Thread(limitedCall).start();
        }
    }
}
