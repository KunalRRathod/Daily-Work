package com.cognizantTraining;

public class MainThread {

    public static void main(String[] args) {
        // Create and initialize the thread object
        Thread thread = Thread.currentThread();
        System.out.print(thread); // output format will be in this style [main {Name of the thread}, s {Priority of the thread, main {Daemon Thread Name}]
        System.out.println(thread.getName()); // lookup name of main thread
        thread.setName("Thread-1"); // rename thread name, does not affect the daemon name
        System.out.println(thread);
        System.out.println(thread.getPriority()); // gives out the priority of the thread
        System.out.println("is Daemon?"+thread.isAlive()); // checks for daemon thread is alive (running) or not
    }
}
