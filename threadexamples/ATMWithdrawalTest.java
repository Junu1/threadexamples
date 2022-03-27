package com.junu.threadexamples;

public class ATMWithdrawalTest {
    public static void main(String[] args) {
        Account account = new Account("008005", 10000);
        AccountHolderThread accountHolderRunnable1 = new AccountHolderThread(account, 2000);
        AccountHolderThread accountHolderRunnable2 = new AccountHolderThread(account, 3000);
        Thread userThread1 = new Thread(accountHolderRunnable1);
        userThread1.start();
        Thread userThread2 = new Thread(accountHolderRunnable2);
        userThread2.start();
    }
}
