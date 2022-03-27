package com.junu.threadexamples;

public class Example1 extends Thread {
    public void run() {
        System.out.println("Thread is running");

    }

    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.start();
    }
}
