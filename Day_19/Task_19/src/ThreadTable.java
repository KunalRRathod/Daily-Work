public class ThreadTable {
    public static void main(String[] args) {
        // table method interface
        TableMaker_of_2 tab_2 = new TableMaker_of_2();
        TableMaker_of_4 tab_4 = new TableMaker_of_4();
        // table interface call
        Thread t1 = new Thread(tab_2);
        Thread t2 = new Thread(tab_4);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
    }

}
