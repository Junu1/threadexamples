package com.junu.threadexamples;

public class Example3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("The thread name is:" + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Example3 t1 = new Example3();
        t1.setName("Main Thread");
        t1.start();
        Thread t2 = currentThread();
        t2.setName("Current Thread");
        for(int i=0;i<5;i++) {
            System.out.println("The thread name is:"+t1.currentThread().getName());

        }
    }

}
