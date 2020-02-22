public class P1_profile implements Runnable {
    synchronized public void run() {
        System.out.println("Player 1 Ready :");
        for (int i = 1; i <= 15; i++) {
            System.out.println("Ping->" + i);
            try {
                for (int sleep = 10; sleep <= 100; sleep++) {
                    Thread.sleep(sleep);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
