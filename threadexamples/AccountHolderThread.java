package com.junu.threadexamples;

public class AccountHolderThread implements Runnable{
    private final Account account;
    private final double amountToWithDraw;

    public AccountHolderThread(Account account, double amountToWithDraw){
        this.account=account;
        this.amountToWithDraw= amountToWithDraw;
    }
    @Override
    public void run(){
        try {
            account.withDraw(amountToWithDraw);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
