public class P2_Profile implements Runnable{
    synchronized public void run() {
        System.out.println("Player 2 Ready :");
        for (int i = 1; i <= 15; i++) {
            System.out.println("<-Pong" + i);
            try {
                for (int sleep = 20; sleep <= 100; sleep++) {
                    Thread.sleep(sleep);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
