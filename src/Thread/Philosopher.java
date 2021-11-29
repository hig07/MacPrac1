package Thread;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread{
    static final int num = 5;
    int id;
    Semaphore lstick, rstick;
    Philosopher(int id, Semaphore lstick, Semaphore rstick){
        this.id = id;
        this.lstick = lstick;
        this.rstick = rstick;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            try{
                if(id % 2 == 0){
                    lstick.acquire();
                    rstick.acquire();
                }
                else{
                    rstick.acquire();
                    lstick.acquire();
                }
                eating();
                rstick.release();
                lstick.release();
                thinking();
            }catch(InterruptedException e){}
        }
    }
    void eating(){
        System.out.println("[" + id + "] eating.");
    }
    void thinking(){
        System.out.println("[" + id + "] thinking.");
    }
    public static void main(String[] args){
        Semaphore[] stick = new Semaphore[num];
        for(int i = 0; i < num; i++){
            stick[i] = new Semaphore(1);
        }
        Philosopher[] phil = new Philosopher[num];
        for(int i = 0; i < num; i++){
            phil[i] = new Philosopher(i, stick[i], stick[(i + 1) % num]);
        }
        for(int i = 0; i < num; i++){
            phil[i].start();
        }
    }
}
