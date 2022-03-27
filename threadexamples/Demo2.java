package com.junu.threadexamples;

public class Demo2 {
    private static int count=0;
    public static synchronized void increaseCounter(){
        count++;
        System.out.println(Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=10;i++){
                    increaseCounter();
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=10;i++){
                    increaseCounter();
                }
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("value:"+count);
    }
}
