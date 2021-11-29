package Thread;
public class Test1 extends Thread{
    int seq;
    public Test1(int seq){
        this.seq = seq;
    }
    public void run() {
        System.out.println(this.seq + " Thread run.");
        try{
            Thread.sleep(2500);
        }catch(Exception e){}
        System.out.println(this.seq + " Thread end.");
    }

    public static void main(String[] args){
        
        for(int i = 0; i < 10; i++){
            Thread t = new Test1(i);
            t.start();
        }
        
        System.out.println("Main end.");
    }
}
