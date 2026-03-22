import java.util.*;
public class Bank {
    
    static int accNo = 10001;
    static int balance = 5000;
    static void deposit(int amt){
        balance = balance + amt;
    }
    static void withdraw(int amt){
        balance = balance - amt;
    }
    
    public static void main(String args[]) {
        System.out.println("Acc No:" + accNo);
        System.out.println("Opening Balance:" + balance);
        deposit(500);
        System.out.println("Deposited Balance:" + balance);
        withdraw(200);
        System.out.println("Withdrawn Balance:" + balance);

    }
}