package Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        BankAccount b = new BankAccount();
        Parent p = new Parent(b);
        Child c = new Child(b);

        p.start();
        c.start();
        p.join();
        c.join();

        System.out.println("잔액 : " + b.getBalance());
    }
}
