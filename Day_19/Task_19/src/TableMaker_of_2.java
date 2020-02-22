// com.cognizantTraining;

public class TableMaker_of_2 implements Runnable {
    public void run() {
        int number = 2;
        for(int i = 1; i<=10; i++){
            int tab = number*i;
            System.out.println("Table of Two : "+tab);
            /*try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

             */
        }
    }
}