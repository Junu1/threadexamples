package com.junu.threadexamples;

public class Demo {
    private static int count=0;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=1000;i++){
                    count++;
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=1000;i++){
                    count++;
                }
            }
        });
        t1.start();
        t2.start();
        System.out.println("value:"+count);
    }
}
