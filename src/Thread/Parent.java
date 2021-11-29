package Thread;

public class Parent extends Thread{
    BankAccount b;
    Parent(BankAccount b){
        this.b = b;
    }
    public void run(){
        for(int i = 0; i < 100; i++){
            try{
                Thread.sleep((int) Math.random() * 10);
            }catch(Exception e){}
            b.deposit(1000);
            System.out.println("천원 저금 -> 남은 금액 : " + b.getBalance());
        }
    }
}
