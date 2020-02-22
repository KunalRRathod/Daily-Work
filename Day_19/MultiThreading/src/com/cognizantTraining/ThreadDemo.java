/*package com.cognizantTraining;

public class ThreadDemo {
   public static void main(String[] args) {
       Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2); // Set Priority of Main Thread
       System.out.println(Thread.currentThread().getName());
      ThreadOne threadOne = new ThreadOne();
       ThreadTwo threadTwo = new ThreadTwo();
       // new method for implementing the interface
       Thread t1 = new Thread(threadOne);
       Thread t2 = new Thread(threadTwo);
       t1.setPriority(Thread.MAX_PRIORITY);
       t2.setPriority(Thread.MAX_PRIORITY-3);
       t1.start();
       t2.start();
       for (int i = 1; i < 5; i++) {
           System.out.println(Thread.currentThread().getName() + " : " + i);
       }
       System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority()); // Get Priority of Main Thread
       System.out.println("Thread One Priority: "+t1.getPriority()); // Get Priority of Thread One
       System.out.println("Thread Two Priority: "+t2.getPriority()); // Get Priority of Thread Two

   }
}
*/