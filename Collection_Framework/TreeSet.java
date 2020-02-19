import java.util.ArrayList;
import java.util.ListIterator;

public class TreeSet {
    

    public static void main(String[] args) {
        TreeSet<String> list = new TreeSet();
        list.add("hello");
        list.add("to");
        list.add("java");
        list.add("batch");
        list.add("7");
        list.add("true");
        Iterator<String> li = list.Iterator();
        System.out.println("*******forward*******");

        String e;
        while(li.hasNext()) {
            e = (String)li.next();
            System.out.println(e);
            if (e.equals("java")) {
                break;
            }
        }

        System.out.println("*******backward*******");

        while(li.hasPrevious()) {
            e = (String)li.previous();
            System.out.println(e);
        }

    }
}
