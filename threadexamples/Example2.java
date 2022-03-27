package com.junu.threadexamples;

public class Example2 implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Example2 e2 = new Example2();
        Thread th = new Thread(e2);
        th.start();
    }
    

}
