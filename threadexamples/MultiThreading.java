package com.junu.threadexamples;

public class MultiThreading implements Runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread("Hello");
        Thread t2 = new Thread("Hy");
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
    @Override
    public void run() {
    }
}
