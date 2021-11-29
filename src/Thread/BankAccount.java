package Thread;

public class BankAccount {
    int balance = 5000;
    synchronized void deposit(int amount){
        balance += amount;
    }
    synchronized void withdraw(int amount){
        balance -= amount;
    }
    int getBalance(){
        return balance;
    }
}
