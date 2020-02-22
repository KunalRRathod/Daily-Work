package com.cognizantTraining;

public class Sync {
    public void display(String name) {
        synchronized (this) {
            for (int i = 1; i<=5; i++) {
                System.out.println("Name Count:" +i+" -"+name);
            }
        }
    }
}
