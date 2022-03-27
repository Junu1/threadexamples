package com.junu.threadexamples;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Example4 ex = new Example4();
        ex.start();
        synchronized (ex){
            ex.wait();
            System.out.println("Total:"+ex.total+"Rs");
        }
    }
}
