package com.junu.threadexamples;

public class Account{
        private final String accountNumber;
        private double balance;


    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
}
public synchronized void withDraw(double amount) throws InterruptedException {
    System.out.println("Withdrawing amount:" +""+ amount +" "+"from account:" + accountNumber + ":" + Thread.currentThread().getName());
    double pendingBalance=this.balance-amount;
    System.out.println("After withdrawal the remaining balance in account is:"+this.balance+":"+Thread.currentThread().getName());

}

}
