import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class SetHash {
    //package com.cts.training.collectionframework;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashSet<String> list = new HashSet<>();
        // set set =new Arrayset();

        list.add("hello");
        list.add("to");
        list.add("java");
        list.add("batch");
        list.add("7");
        list.add("true");
        Iterator<String> it = list.iterator();
                while(it.hasNext())
                {
                    String element = it.next();
                    System.out.println(element);
                }
        /*

        Iterator<String> li = list.listIterator();
        System.out.println("*******forword*******");
        while (li.hasNext()) {
            String e = li.next();
            System.out.println(e);
            if (e.equals("java")) {
                break;
            }

        }
        System.out.println("*******backword*******");

        while (li.hasPrevious()) {
            String e = li.previous();
            System.out.println(e);
        }

         */
    }

}

