public class TableMaker_of_4 implements Runnable {
    public void run() {
        for(int i = 1; i<=10; i++){
            int number = 4;
            int tab = number*i;
            System.out.println("Table of Four : "+tab);
            try {
                Thread.sleep(60);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
