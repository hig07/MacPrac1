public class Test_Thread extends Thread{
    int seq;
    public Test_Thread(int seq){
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
            Thread t = new Test_Thread(i);
            t.start();
        }
        
        System.out.println("Main end.");
    }
}
