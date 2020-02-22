package com.cognizantTraining;

public class ThreadTwo extends Thread {
    @Override
    public void run() {
        for(int i = 1; i<10; i++){
            System.out.println("Thread Two : "+i);
            try {
                Thread.sleep(300);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
