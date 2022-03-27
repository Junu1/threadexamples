package com.junu.threadexamples;

public class Example5 extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread");//Daemon thread
    }

    public static void main(String[] args) {
        System.out.println("Main Thread");
        Example5 t1 = new Example5();
        t1.setDaemon(true);
        t1.start();
    }
}
