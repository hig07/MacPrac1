package Thread;

import java.util.ArrayList;

public class Test2 extends Thread{
    int seq;
    public Test2(int seq) {
        this.seq = seq;
    }
    public void run(){
        System.out.println(this.seq + " Thread run.");
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
        System.out.println(this.seq + " Thread end.");
    }
    public static void main(String[] args){
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for(int i = 0; i < 10; i++){
            Thread t = new Thread(new Test2(i));
            t.start();
            threads.add(t);
        }
        for(int i = 0; i < threads.size(); i++){
            Thread t = threads.get(i);
            try{
                t.join();
            }catch(Exception e){
            }
        }
        System.out.println("Main end.");
    }
}
