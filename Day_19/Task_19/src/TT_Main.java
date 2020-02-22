
public class TT_Main  {

    public static void main(String[] args) throws InterruptedException {
        P1_profile player1 = new P1_profile();
        P2_Profile player2 = new P2_Profile();

        Thread plr_1 = new Thread(player1);
        Thread plr_2 = new Thread(player2);

        plr_1.setPriority(Thread.NORM_PRIORITY);
        plr_2.setPriority(Thread.NORM_PRIORITY);
        plr_1.start();
        plr_2.start();
        plr_1.join();

    }
}
